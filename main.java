
public class main {

	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(8.23);
		main.setlebar(3.25);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("------Object Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Faeruddin";
		mahasiswa.nim = "D0217325";
		mahasiswa.alamat = "Kamp.Baru";
		mahasiswa.golonganDarah = "O";
		mahasiswa.status = "Mahasiswa";
		mahasiswa.tinggiBadan = "160";
		mahasiswa.beratBadan = "55";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		node node = new node();
		
		//method setter node
		node.label = "Benda";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "Faeruddin";
		stack.value[1] = "aswad";
		stack.value[2]= "udin";
		stack.value[3]= "sadly";
		stack.value[4]= "subhan tarman";
		stack.value[5]= "nadra";
		stack.value[6]= "aswandi";
		stack.value[7]= "ruslan";
		stack.value[8]= "muliana";
		stack.value[9]= "yuliana";
		stack.value[10]= "marwah";
		stack.value[11]= "muhammad mohar";
		stack.value[12]= "mensi jenjaka";
		stack.value[13]= "paturusi";
		stack.value[14]= "arnoldus renaldi";
		stack.value[15]= "m jaimuddin";
		stack.value[16]= "jumardi";
		stack.value[17]= "mujaeni";
		stack.value[18]= "nurlina";
		stack.value[19]= "sayyidah";
		stack.value[20]= "mariani";
		stack.value[21]= "agung";
		stack.value[22]= "ali";
		stack.value[23]= "muhammad";
		stack.value[24]= "dewi";
		stack.value[25]= "nur";
		stack.value[26]= "dian";
		stack.value[27]= "sri";
		stack.value[28]= "putri";
		stack.value[29]= "raja";
		stack.value[30]= "putra";
		stack.value[31]= "eka";
		stack.value[32]= "sari";
		stack.value[33]= "dani";
		stack.value[34]= "sultan";
		stack.value[35]= "ilyas";
		stack.value[36]= "rasjan";
		stack.value[37]= "fadly";
		stack.value[38]= "khaliq";
		stack.value[39]= "iqbal";
		stack.value[40]= "ikbal";
		stack.value[41]= "aqil";
		stack.value[42]= "idil";
		stack.value[43]= "sukran";
		stack.value[44]= "bambang";
		stack.value[45]= "jacki";
		stack.value[46]= "sitti";
		stack.value[47]= "nanda";
		stack.value[48]= "madina";
		stack.value[49]= "rajab";
		stack.value[50]= "hasan";
		stack.value[51]= "husain";
		stack.value[52]= "opik";
		stack.value[53]= "agus";
		stack.value[54]= "dandi";
		stack.value[55]= "andi";
		stack.value[56]= "ulfa";
		stack.value[57]= "paisal";
		stack.value[58]= "alifah ariani";
		stack.value[59]= "kanda";
		stack.value[60]= "iksan";
		stack.value[61]= "bani";
		stack.value[62]= "doni";
		stack.value[63]= "tarra";
		stack.value[64]= "manda";
		stack.value[65]= "fitri";
		stack.value[66]= "ratna";
		stack.value[67]= "ahmad";
		stack.value[68]= "budi";
		stack.value[69]= "adi";
		stack.value[70]= "eko";
		stack.value[71]= "jokowi";
		stack.value[72]= "yusuf";
		stack.value[73]= "sosilo";
		stack.value[74]= "mandra";
		stack.value[75]= "mandar";
		stack.value[76]= "bujang";
		stack.value[77]= "bang";
		stack.value[78]= "dina";
		stack.value[79]= "farhan";
		stack.value[80]= "koni";
		stack.value[81]= "bakku";
		stack.value[82]= "made";
		stack.value[83]= "agustina";
		stack.value[84]= "setiawan";
		stack.value[85]= "rizky";
		stack.value[86]= "rini";
		stack.value[87]= "rani";
		stack.value[88]= "apriana";
		stack.value[89]= "wahyuni";
		stack.value[90]= "wahyudi";
		stack.value[91]= "arief";
		stack.value[92]= "murni";
		stack.value[93]= "abdullah";
		stack.value[94]= "irma";
		stack.value[95]= "novi";
		stack.value[96]= "astuti";
		stack.value[97]= "saputra";
		stack.value[98]= "erwin";
		stack.value[99]= "hari";
		
		stack.setvalueAt(1 ,"fhaer");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};


	}

}
