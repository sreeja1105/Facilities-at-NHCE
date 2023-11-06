package sem4;
import java.util.*;

public class Facilities {
public static void main(String [] args)
	{
	Scanner a=new Scanner(System.in);
	int i;
	do
	{
	System.out.println("_____________________________________________________________");
	System.out.println(" FACILITIES AT NHCE"); 
	System.out.println(" ENTER THE NUMBER WHICH FACILITY INFORMATION REQUIRED FOR YOU"); 
	System.out.println("1.LIBRARY,\n2.DATA CENTER,\n3.SPECIAL LABORATORIES\n"
	+"4.COMMUNICATION AND SOFTSKILLS,\n5.PHYSICAL EDUCATION,\n6.HOSTELS\n");
	System.out.println("_____________________________________________________________");
	SCAN ab=new SCAN();
	LIBRARY ab1=new LIBRARY();
	DATA ab2=new DATA();
	LABORATORIES ab3=new LABORATORIES();
	COMMUNICATION ab4=new COMMUNICATION();
	PHYSICAL ab5=new PHYSICAL();
	HOSTELS ab6=new HOSTELS();
	i=a.nextInt();
	switch(i)
	{
	case 1:
	ab1.library();
	break;
	case 2:
	ab2.data();
	break;
	case 3:
	ab3.laboratories();
	break;
	case 4:
	ab4.communication();
	break;
	case 5:
	ab5.physical();
	break;
	case 6:
	ab6.hostels();
	break;
	case 7:
	System.out.println("BYe");
	break;
	default : 
		System.out.println("---------------------------------------");
		System.out.println("THIS KEY IS NOT AVILABLE:SORRY ");
		System.out.println("---------------------------------------");
		}
		}while(i!=7);
		}
		}

	class SCAN
	{
	Scanner b=new Scanner(System.in);
	}
	class LIBRARY extends SCAN
	{
	public void library()
	{
	int e;
	System.out.println("_____________________________________________________________");
	System.out.println("The Central Library of NHCE holds a large number of materials to serve the whole University community."
	+" It holds materials relevant to the Engineering, Science & Humanities courses offered by the University, and includes Agricultural Engineering, Pharmacy, "
	+"Law and specialist books and journals.\n \t The library system contains more than one lakh and fifty thousand books, and five hundred hard copy "
	+"of periodicals on all subjects related to the teaching and research interests of the University staff and students. The library has over 21,300 electronic "
	+"journal titles, academic databases and about 30 lakhs  eBooks which includes World E-Books Collection. Access is available on campus on student"
	+" computers and remotely.\n \t A new library building has been opened recently on par with an international standard with modern IT facilities.");
	System.out.println("1.LIBRARY SERVICES ,2.DEPARTMENT LIBRARY,3.POLICIES AND RULES");
	System.out.println("_____________________________________________________________");
	e=b.nextInt();
	switch(e)
	{
	case 1:
	System.out.println("In additional to all general services, the Central Library provides various value added services "
	+"including \n Circulation Service through RFID \n Reference Service \n Web OPAC "
	+"(Online Public Access Catalogue)\n Multimedia Resource Service \n Digital Library"
	+" Service \n Photocopying Service \n Resource Sharing (Inter Library Loan) Service \n NPTEL "
	+"E-Learning Services \n Institutional Repository \n Patents Information \n Standards Information \n User Education Program.");
	break;
	case 2:
	System.out.println("Every department of the college is maintain their library to cater more member of students. Each student"
	+" will be issued additional book at the department library in addition to the central facility. all foreign and Indian journals"
	+" are made available in the department library for the convenience of faculty and students. The following table describes"
	+" the number of books in the respective departments.");
	System.out.println("Biotechnology\t287\nCivil Engineering\t1442\nComputer Science Engineering\t1246\nCommunication "
	+"Softskills\t496\nElectronic & Communication Engg.\t1616\nElectronics & Computer Engineering\t686\nElectrical & "
	+"Electronics Engineering\t809\nInformation Science & Technology\t641\nIndustrial Production Engineering\t579\nMechanical "
	+"Engineering\t2753\nAdministrative Office\t35\nFreshmen Engineering Department\t287\nMBA\t446\nMCA\t385\nTotal\t11745");
	break;
	case 3:
	System.out.println("General Rules\n"
	+"1.Faculty Members, Non Teaching staff and Student members of KLU are allowed to use the Library.\n"
	+"2. Members should always carry their ID cards while using the Library.\n"
	+"3.Readers should observe strict silence inside the Library.\n"
	+"4.Uses of Mobile phones are not permitted inside the Library premise.\n"
	+"5.Members are responsible for books issued against their membership.\n"
	+"Readers are not allowed to bring their personal books or any printed material inside the Library.\n"
	+"Online Chatting is not allowed.");
	break;
	default :
	System.out.println("---------------------------------------");
	System.out.println("THIS KEY IS NOT AVILABLE:SORRY ");
	System.out.println("---------------------------------------");
	break;
	}
	}
	}
	class DATA extends SCAN
	{
	public void data()
	{
	int f;
	System.out.println("_____________________________________________________________");
	System.out.println("1.COMPUTER NETWORKING ,2.HARDWARE");
	System.out.println("_____________________________________________________________");
	f=b.nextInt();
	switch(f)
	{
	case 1:
	System.out.println("Campus wide network has been established with hi speed fiber optic back bone.\n"
	+"800 Mbps Internet connectivity with multiple ISPs.\n"
	+"Round the clock Internet connectivity\n"
	+"Total Wi–Fi (AC/B/G\n) enabled campus.\n"
	+"E-learning facilities\n2759 computers are installed in various computer centers across the university"
	+" which are open from 7AM - 10PM.");
	break;
	case 2:
	System.out.println("A high end stream of servers provides various services.\n"
	+"Super Computer\n"
	+"HPC Infrastructure (Super Computer): \n"
	+" 5.3 TERA Flops ( CPU + GPU)\n"
	 +"HP SL 230 4* SL230s Gen8, (2 * 2.6 GHz, 32GB RAM, 2x500GB HD, 10G IB HCA) providing -1.3TF\n"
	+" HP SL 250 2* SL250s Gen8, (2 * 2.6 GHz, 32GB RAM, 2x500GB HD, 10G IB HCA + 2 NVIDIA K20 GPU providing -4TF");
	break;
	default :
	System.out.println("---------------------------------------");
	System.out.println("THIS KEY IS NOT AVILABLE:SORRY ");
	System.out.println("---------------------------------------");
	break;
	}
	}
	}
	class LABORATORIES extends SCAN
	{
	public void laboratories()
	{
	System.out.println("1.	Computer Science and Engineering\tCISCO\tComputer Networks and security");
	System.out.println("2.Computer Science and Engineering\tIBM\tSoftware Engineering");
	System.out.println("3.Computer Science and Engineering\tMicrosoft\tEmbedded Systems,Software Engineering,Knowledge Engineering");
	System.out.println("4.Computer Science and Engineering\tOracle\tKnowledge Engineering");
	System.out.println("5.	Electronics Communication Engineering\tNI Lab View\tCommunications Systems");
	}
	}
	class COMMUNICATION extends SCAN
	{
	public void communication()
	{
	System.out.println("Mission:\n To facilitate the transition of students from a world of raw talent and aspirations into a world of"
	+" intellectual élan and \nmaturity by providing them a platform for all such skills and knowledge that constitute a complete professional.\n"
	+"In the process of building successful careers in engineering and science, the areas which are most often overlooked are Aptitude and Soft skills.\n"
	+" It is with the intention of bridging this gap that the department of Communication and Soft Skills came into being.\n"
	+" The department offers qualitative training by experienced professionals in the following areas:\n"
	+"Quantitative Aptitude and Reasoning\n"
	+"Employability skills\n"
	+"Professional communication and ethics");
	}
	}
	class PHYSICAL extends SCAN
	{
	public void physical()
	{
	System.out.println("NHCE encourages students to explore their latent talents by providing good games and sports facilities. The institute is equipped with the following.\n"
	+"Athletic track\nHockey Field\nBadminton Courts -4\nTenni-koit Courts -2\nCricket Field with Net practice - 3\nVolleyball Courts -4\nTennis Courts - 2\n"
	+"Handball Court\nNetball Courts - 2\nThrow ball courts - 2\nBeach Volleyball Court\nFootball Field\nBasketball Courts – 2\nKabaddi Courts – 2\n"
	+"Table Tennis - 6\nChess\nCaroms\nKho Kho Court\nSoft Ball\nArchery");
	}
	}
	class HOSTELS extends SCAN
	{
	public void hostels()
	{
	int k;
	System.out.println("ACCOMODATION\n"
	+"NHCE has separate hostels for boys and girls with well furnished rooms and modern amenities.\n"
	+" The overall atmosphere is very conducive for the students to concentrate on studies.\n"
	+"A state- of – the- art kitchen and spacious dining area has been provided for both the hostels.\n"
	+"Generators have been provided as power back up.\n"
	+"Emphasis has been laid on hygiene and cleanliness for healthy living.\n"
	+" A customized menu caters to the student needs and it keeps changing according to their tastes.\n"
	+"Teaching staff will have to address academic and personal problems of the students.\n"
	+"Round-the-clock security, communication, dispensary facilities are also available."
	+"Wi-Fi enabled hostels.\n"
	+"The Girls Hostel\nThe girls hostel is with in the campus and houses 1024 with a capacity of 1192 with 500 rooms.\n"
	+" Different rooms accommodating 2 per room, 3 per room with attached toilets as well as A.C. rooms are also available.\n"
	+" Suite rooms with modern furniture and separate study room are also available."
	+"The Boys Hostel\nIt is a short walk from the university accommodating 1957 students with a capacity of 2040 with 780 rooms. \n"
	+"Different rooms accommodating 2 per room, 3 per room with attached toilets as well as A.C. rooms are also available.\n"
	+"Facilities in the Hostels\nGas & Steam based hygienic food preparation\nPalatable regional, national and international cuisines\n"
	+"Cleanliness and Safety\nSTD/ISD Facilities\nMedical Kits and First Aid Boxes\nSoft drinks, snacks, Fruits etc.\nLaundry"
	+"Stationary shop\nForeign nationals\nRI/PIOs feel at home in hostels");
	}
	}
	
	

