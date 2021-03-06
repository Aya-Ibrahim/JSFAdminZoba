/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charts;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author yoka
 */
@ManagedBean
@RequestScoped
public class ChartManagedBean {

    /**
     * Creates a new instance of ChartManagedBean
     */
    
    public ChartManagedBean() {
    }
      private PieChartModel pieModel1;
    private PieChartModel pieModel2;
 
    @PostConstruct
    public void init() {
        System.out.println("hello it runs wow");
        createPieModels();
    }
 
    public PieChartModel getPieModel1() {
        return pieModel1;
    }
     
    public PieChartModel getPieModel2() {
        return pieModel2;
    }
     
    private void createPieModels() {
        createPieModel1();
        createPieModel2();
    }
 
    private void createPieModel1() {
        pieModel1 = new PieChartModel();
         
        pieModel1.set("Brand 1", 540);
        pieModel1.set("Brand 2", 325);
        pieModel1.set("Brand 3", 702);
        pieModel1.set("Brand 4", 421);
         
        pieModel1.setTitle("Simple Pie");
        pieModel1.setLegendPosition("w");
    }
     
    private void createPieModel2() {
        pieModel2 = new PieChartModel();
         
        pieModel2.set("Brand 1", 540);
        pieModel2.set("Brand 2", 325);
        pieModel2.set("Brand 3", 702);
        pieModel2.set("Brand 4", 421);
         
      //  pieModel2.setTitle("Custom Pie");
        //pieModel2.setLegendPosition("w");
        pieModel2.setFill(true);
      //  pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(50);
       // pieModel2.set
       
    }
    
}
