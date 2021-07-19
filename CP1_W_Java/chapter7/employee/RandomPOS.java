package employee;

public class RandomPOS extends RandomDPT {

	public String[] mng = {
			"VP ", "Lead ", "Head ", "Senior ", "Assistant ", 
			"Assistant ", "Assistant ", "Assistant ", "Assistant ", "Assistant ", "Assistant ",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "Robbie", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
			
	};
	
	public String[] soft = {
			"Programmer", "Software Dev", "Beta Tester", "Graphic Designer", 
			"Sound Artist", "Operating System Designer", "GUI Designer"
	};
	public String[] eng = {
			"Electrical Engineer", "CAD Artist", "Chassis Designer", "Mechanical Engineer", 
			"Materials Science", "Network Designer"
	};
	public String[] util = {
			"Custodian", "Electrician", "Plumber", "Repairman"
	};
	public String[] IT = {
			"Datacenter Technician", "Datacenter Technician", "Datacenter Technician", "Datacenter Technician", 
			"Network Admin", "AD Admin", 
			"Cisco Tech", "Cisco Tech", "Cisco Tech", "Cisco Tech",
			"Dell Tech", "Dell Tech", "Dell Tech", "Dell Tech", 
			"Virtualization Tech", "Virtualization Tech", 
			"Tech", "Tech", "Tech", "Tech", "Tech", "Tech", "Tech", "Tech", "Tech", "Tech", "Tech", "Tech", "Tech",
			"Inventory", "Inventory", "Inventory", "Inventory"
	};
	
	public String[] fin = {
			"Accounting", "Accounting", "Accounting", "Accounting", "Accounting", "Accounting", "Accounting", "Accounting", 
			"Accounting", "Accounting", "Accounting", "Accounting", "Accounting", "Accounting", "Accounting", "Accounting", 
			"Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", 
			"Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", 
			"Sales", "Sales", "Sales", "Sales", "Sales", "Robbie", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales",
			"Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", "Sales", 
	};
	
	public String[] other = {
			""
	};
	
	public String getPos(String dept) {
		
		switch(dept) {
		case "Engineering":
			return mng[select(mng.length)] + eng[select(eng.length)];
		case "Software":
			return mng[select(mng.length)] + soft[select(soft.length)];
		case "Utilities":
			return util[select(util.length)];
		case "Technology":
			return mng[select(mng.length)] + IT[select(IT.length)];
		case "Managment":
			return mng[select(mng.length)];
		case "Finance":
			return mng[select(mng.length)] + fin[select(fin.length)];
		case "Human Resources":
			return "Specialist"; 
		default:
			return "Other";
		} 
		
//		if (dept.equalsIgnoreCase("Engineering")) {
//			return mng[select(mng.length)] + eng[select(eng.length)];
//		} else if (dept.equalsIgnoreCase("Software")) {
//			return mng[select(mng.length)] + soft[select(soft.length)];
//		} else if (dept.equalsIgnoreCase("Utilities")) {
//			return util[select(util.length)];
//		} else if (dept.equalsIgnoreCase("Information Tech")) {
//			return mng[select(mng.length)] + IT[select(IT.length)];
//		} else if (dpt.equalsIgnoreCase("Managment")) {
//			return mng[select(mng.length)];
//		} else if (dpt.equalsIgnoreCase("Finance")) {
//			return mng[select(mng.length)] + fin[select(fin.length)];
//		} else if (dpt.equalsIgnoreCase("Human Resources")) { 
//			return "Specialist";
//		} else {
//			return "Other";
//		}
	}
	
}
