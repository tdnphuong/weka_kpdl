/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.classifiers.trees.J48;
import wekapro.ensembles.MyBaggingModel;


/**
 *
 * @author LENOVO
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel (
//                "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff");
//        System.out.println(model);
//        model.saveData("D:\\Test\\iris.arff");
//        model.saveData2CSV("D:\\Test\\iris_CSV.csv");
//        MyAprioriModel model = new MyAprioriModel(
//                            "C:\\Program Files\\Weka-3-8-5\\data\\weather.numeric.arff",
//                            "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
//                            "-R 2-3");
//        model.mineAssociationRules();

//        MyFPGrowthModel model = new MyFPGrowthModel(
//                "C:\\Program Files\\Weka-3-8-5\\data\\weather.nominal.arff",
//                "-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.2",
//                "-N -R first-last");
//        model.mineAssociationRules();
//        System.out.println(model);
          // Train - test set
//        MyKnowledgeModel model = new MyKnowledgeModel(
//                "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff", null, null);
//        model.trainset = model.divideTrainTestR(model.dataset, 80, false);
//        model.testset = model.divideTrainTestR(model.dataset, 80, true);
//        System.out.println(model);
//        System.out.println(model.trainset.toSummaryString());
//        System.out.println(model.testset.toSummaryString());
        // Cay quyet dinh
//        MyDecisionTreeModel model = new MyDecisionTreeModel(
//                "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff",
//                "-C 0.25 -M 2", null);
//        model.buildDecisionTree();
//        model.evaluateDecisionTree();
//        System.out.println(model);
//        //Tao file decisiontree
////        model.saveModel("D:\\STUDY\\KHAIPHA_DL\\Bai7WK\\decisiontree.model", model.tree);
//        model.tree = (J48)model.loadModel("D:\\STUDY\\KHAIPHA_DL\\Bai7WK\\decisiontree.model");
//        model.predictClassLabel(model.testset);

        // Mo hinh Naive Bayes
//        MyNaiveBayesModel model = new MyNaiveBayesModel();
//        model.buildNaiveBayes("D:\\STUDY\\KHAIPHA_DL\\Naive Bayes\\iris_train.arff");
//        model.evaluateNaivebayes("D:\\STUDY\\KHAIPHA_DL\\Naive Bayes\\iris_test.arff");
//        model.predictClassLabel("D:\\STUDY\\KHAIPHA_DL\\Naive Bayes\\iris_unlabel.arff",
//                                    "D:\\STUDY\\KHAIPHA_DL\\Naive Bayes\\iris_predict_nb.arff");
//        System.out.println(model);

        // Mo hinh Mang no ron
//        MyNeuralNetworkModel model = new MyNeuralNetworkModel("",
//                                "-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a -R",
//                                null);
//        model.buildNeuralNetwork("D:\\STUDY\\KHAIPHA_DL\\NeuralNetwork\\iris_train.arff");
//        model.evaluateNeuralNetwork("D:\\STUDY\\KHAIPHA_DL\\NeuralNetwork\\iris_test.arff");
//        model.predictClassLabel("D:\\STUDY\\KHAIPHA_DL\\NeuralNetwork\\iris_unlabel.arff",
//                                    "D:\\STUDY\\KHAIPHA_DL\\NeuralNetwork\\iris_predict_ann.arff");
//        System.out.println(model);

        // Mo hinh SVM
//        MySVMModel model = new MySVMModel("",
//            "-C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007\" -calibrator \"weka.classifiers.functions.Logistic -R 1.0E-8 -M -1 -num-decimal-places 4\"", null);
//        model.buildSVM("D:\\STUDY\\KHAIPHA_DL\\SVM\\iris_train.arff");
//        model.evaluateSVM("D:\\STUDY\\KHAIPHA_DL\\SVM\\iris_test.arff");
//        model.predictClassLabel("D:\\STUDY\\KHAIPHA_DL\\SVM\\iris_unlabel.arff",
//                "D:\\STUDY\\KHAIPHA_DL\\SVM\\iris_predict_svm.arff");
//        System.out.println(model); 
        
       
        // Mo hinh KNN
//        MyKNNModel model = new MyKNNModel("",
//            "-K 3 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\"", null);
//        model.buildKNN("D:\\STUDY\\KHAIPHA_DL\\kLC\\iris_train.arff");
//        model.evaluateKNN("D:\\STUDY\\KHAIPHA_DL\\kLC\\iris_test.arff");
//        model.predictClassLabel("D:\\STUDY\\KHAIPHA_DL\\kLC\\iris_unlabel.arff",
//                "D:\\STUDY\\KHAIPHA_DL\\kLC\\iris_predict.arff");
//        System.out.println(model);
    
        // Phuong phap Bagging
        MyBaggingModel model = new MyBaggingModel("", null, null);
        model.buildMyBaggingModel("D:\\STUDY\\KHAIPHA_DL\\IRIS\\iris_train.arff");
        model.evaluateBaggingModel("D:\\STUDY\\KHAIPHA_DL\\IRIS\\iris_test.arff");
        model.predictClassLabel("D:\\STUDY\\KHAIPHA_DL\\IRIS\\iris_unlabel.arff", 
               "D:\\STUDY\\KHAIPHA_DL\\IRIS\\iris_predict_bag.arff");
        System.out.println("Finished");
    }
}
