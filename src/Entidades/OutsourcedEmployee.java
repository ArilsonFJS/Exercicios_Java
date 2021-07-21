package Entidades;

/**
 *
 * @author arils
 */
public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(Double addtionalCharge, String nome, Integer horas, Double valorHora) {
        super(nome, horas, valorHora);
        this.additionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return additionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.additionalCharge = addtionalCharge;
    }
    
    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
