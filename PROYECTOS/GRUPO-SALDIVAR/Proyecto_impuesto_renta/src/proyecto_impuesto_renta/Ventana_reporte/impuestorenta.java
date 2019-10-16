
package proyecto_impuesto_renta.Ventana_reporte;

public class impuestorenta {
    private double ingreso;
    private String exoneracion;
    private double impuesto;
    private double renumeracionAnual;
    private double deduccion;
    private double total_cuarta;
    private double quinta;
    private double QuintaCuartaTotal;
    private double deduccion_7;
    private double importe;
    private double importePagar; 

    public impuestorenta() {
    }
    
    public impuestorenta(double ingreso, double renumeracionAnual, double quinta) {
        this.ingreso = ingreso;
        this.renumeracionAnual = renumeracionAnual;
        this.quinta = quinta;
       
    }
    
    public void totalcuarta() {        
        
    }
    
    public double getCalculoImporte(){
        if(this.deduccion_7 <= 20750){
            this.importe = this.deduccion_7 * 0.08;      
        }else if(this.deduccion_7 > 20750 && this.deduccion_7 <= 83000){
            this.importe = this.deduccion_7 * 0.14; 
        }else if(this.deduccion_7 > 83000 && this.deduccion_7 <= 145250){
            this.importe = this.deduccion_7 * 0.17; 
        }else if(this.deduccion_7 > 145250 && this.deduccion_7 <= 186750){
            this.importe = this.deduccion_7 * 0.20;     
        }else if(this.deduccion_7 > 186750){
            this.importe = this.deduccion_7 * 0.30; 
        }
       return this.importe;   
    } 
    
    public void getImporteExoneracion(){
        if(this.renumeracionAnual < 36750.00){
           this.exoneracion="Exonerado";
           
       }else if(this.renumeracionAnual<50000.00){
           this.exoneracion="4ta Cagoria";
           this.impuesto=this.ingreso*0.08;
           
       }else{
           this.exoneracion="5ta categoria";
           this.impuesto=this.ingreso*0.14;
       }  
    
    }
  
    public double getCalculoImportePagar(){
       return this.importePagar = this.importe/12;   
    }
    
    public double getCalculoCuarta(){
       return this.deduccion = this.renumeracionAnual * 0.20;   
    }
    
    public double getCalculoCuartaTotal(){
       return this.total_cuarta = this.renumeracionAnual-(this.renumeracionAnual * 0.20);   
    }
    
    public double getCalculoQuintaCuartaTotal(){
        
       return this.QuintaCuartaTotal = this.quinta + this.total_cuarta;   
    }

    public double getCalculoDeduccion(){
        
        if(this.QuintaCuartaTotal <= 29050){
            this.deduccion_7 = 0;
        }else if(this.QuintaCuartaTotal > 29050){
            this.deduccion_7 = this.QuintaCuartaTotal - 29050; 
        }
        
       return this.deduccion_7;   
    }
    

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public String getExoneracion() {
        return exoneracion;
    }

    public void setExoneracion(String exoneracion) {
        this.exoneracion = exoneracion;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
     public double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
    }
    
    //private double ingreso;

    public double getRenumeracionAnual() {
        return renumeracionAnual;
    }

    public void setRenumeracionAnual(double renumeracionAnual) {
        this.renumeracionAnual = renumeracionAnual;
    }
    
        public double getTotal_cuarta() {
        return total_cuarta;
    }

    public void setTotal_cuarta(double total_cuarta) {
        this.total_cuarta = total_cuarta;
    }
    

    public double getQuinta() {
        return quinta;
    }

    public void setQuinta(double quinta) {
        this.quinta = quinta;
    }

    public double getQuintaCuartaTotal() {
        return QuintaCuartaTotal;
    }

    public void setQuintaCuartaTotal(double QuintaCuartaTotal) {
        this.QuintaCuartaTotal = QuintaCuartaTotal;
    }
    public double getDeduccion_7() {
        return deduccion_7;
    }

    public void setDeduccion_7(double deduccion_7) {
        this.deduccion_7 = deduccion_7;
    }    
    
        public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
     public double getImportePagar() {
        return importePagar;
    }

    public void setImportePagar(double importePagar) {
        this.importePagar = importePagar;
    }

}
