
public class PattanakarnBranch extends Product{//ถ้าต้องการให้สามารถเรียกใช้ คาด Product ได้

	private int payUnit() {
		return super.getUnit() / 2; // การเรียนใช้metood จากที่อื่นได้
	}
	public int freeUnit() {
		return super.getUnit() -this.payUnit();
	}
	public int getTotalprice() {
		return this.payUnit() * 100;
	}
	public String toString() {
		return "You buy "+this.payUnit()+" units, get free "+this.freeUnit()+ "units ("+this.getTotalprice()+")";
	}
}
