/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro.cluster;

import weka.clusterers.EM;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import wekapro.MyKnowledgeModel;

/**
 *
 * @author LENOVO
 */
public class MyEMModel extends MyKnowledgeModel{
    EM em;

    public MyEMModel() {
    }

    public MyEMModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
    
    public void buildEMModel(String filename) throws Exception {
        setTrainset(filename);
        
        em = new EM();
        em.buildClusterer(trainset);
        System.out.println(em);
    }
    
    public void predictCluster(String filename) throws Exception{
        DataSource ds = new DataSource(filename);
        Instances unlabel = ds.getDataSet();
        for(int i = 0; i < unlabel.numInstances(); i++){
            double predict = em.clusterInstance(unlabel.instance(i));
            System.out.println("Instance " + i + "belongs to cluster " + predict);
        }
    }
}
