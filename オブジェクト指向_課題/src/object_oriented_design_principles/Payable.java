package object_oriented_design_principles;

// 給料計算可能な社員の抽象クラス
public interface Payable {
	String getName();

	int calculateSalary(int hourWorked);
}
