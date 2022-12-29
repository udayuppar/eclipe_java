package com.xworkz.collections.boot.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamsInIndia {

	public static void main(String[] args) {

		String reverse = " ";

		Collection<String> karnataka = new ArrayList<String>();
		karnataka.add("Krishna Raja Sagara");
		karnataka.add("Tungabhadra ");
		karnataka.add("Bhadra ");
		karnataka.add("Linganamakki ");
		karnataka.add("Malaprabha ");
		karnataka.add("Raja Lakhamagouda");
		karnataka.add("Hemavathy");
		karnataka.add("Supa");
		karnataka.add("Lakya");
		karnataka.add("Almatti");
		System.out.println("Size of dam in karnataka : " + karnataka.size());

		Collection<String> rajasthan = new ArrayList<String>();
		rajasthan.add("RanapratapSagar");
		rajasthan.add("Mahi Bajaj Sagar ");
		rajasthan.add("Bisalpur");
		System.out.println("Size of dam in rajasthan : " + rajasthan.size());

		Collection<String> andraPradesh = new ArrayList<String>();
		andraPradesh.add("Srisailam ");
		andraPradesh.add("Somasila ");
		andraPradesh.add("Prakasam Barrage ");
		andraPradesh.add("Tatipudi Reservoir ");
		andraPradesh.add("Gandipalem Reservoir ");
		andraPradesh.add("Ramagundam ");
		andraPradesh.add("Dummaguden ");
		System.out.println("Size of dam in andraPradesh : " + andraPradesh.size());

		Collection<String> telangana = new ArrayList<String>();
		telangana.add("Nagarjuna Sagar ");
		telangana.add("Sri Ram Sagar ");
		telangana.add("Nizam Sagar ");
		telangana.add("Dindi Reservoir ");
		telangana.add("Lower Manair ");
		telangana.add("Singur ");
		System.out.println("Size of dam in telangana : " + telangana.size());

		Collection<String> bihar = new ArrayList<String>();
		bihar.add("Kohira ");
		bihar.add("Nagi ");
		System.out.println("Size of dam in bihar : " + bihar.size());

		Collection<String> chhattisgarh = new ArrayList<String>();
		chhattisgarh.add("HasdeoBango");
		System.out.println("Size of dam in chhattisgarh : " + chhattisgarh.size());

		Collection<String> gujarat = new ArrayList<String>();
		gujarat.add("SardarSarovar");
		gujarat.add("Ukai ");
		gujarat.add("Kadana ");
		gujarat.add("Karjan Reservoir ");
		System.out.println("Size of dam in gujarat : " + gujarat.size());

		Collection<String> himachalPradesh = new ArrayList<String>();
		himachalPradesh.add("Bhakra ");
		himachalPradesh.add("The Pong  ");
		himachalPradesh.add("The Chamera");
		System.out.println("Size of dam in himachalPradesh : " + himachalPradesh.size());

		Collection<String> jammuKashmir = new ArrayList<String>();
		jammuKashmir.add("Salal ");
		jammuKashmir.add("Baglihar ");
		System.out.println("Size of dam in jammuKashmir : " + jammuKashmir.size());

		Collection<String> Jharkhand = new ArrayList<String>();
		Jharkhand.add("The Maithon ");
		Jharkhand.add("Panchet");
		Jharkhand.add("Tenughat ");
		System.out.println("Size of dam in Jharkhand : " + Jharkhand.size());

		Collection<String> kerala = new ArrayList<String>();
		kerala.add("Kakki Reservoir");
		kerala.add("The Idukki ");
		kerala.add("Cheruthoni");
		kerala.add("Kulamavu ");
		kerala.add("Idamalayar");
		System.out.println("Size of dam in kerala : " + kerala.size());

		Collection<String> madhyaPradesh = new ArrayList<String>();
		madhyaPradesh.add("Gandhi Sagar ");
		madhyaPradesh.add("Tawa Reservoir");
		madhyaPradesh.add("Indira Sagar ");
		System.out.println("Size of dam in madhyaPradesh : " + madhyaPradesh.size());

		Collection<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Koyna ");
		maharashtra.add("Jayakwadi");
		maharashtra.add("Isapur ");
		maharashtra.add("Totladoh ");
		maharashtra.add("Warna ");
		maharashtra.add("Bhatsa ");
		System.out.println("Size of dam in maharashtra : " + maharashtra.size());

		Collection<String> odisha = new ArrayList<String>();
		odisha.add("Hirakud ");
		odisha.add("Rengali ");
		odisha.add("Indravati ");
		odisha.add("The Jalaput");
		odisha.add("Mandira  ");
		System.out.println("Size of dam in odisha : " + odisha.size());

		Collection<String> punjab = new ArrayList<String>();
		punjab.add("The Ranjit Sagar");
		System.out.println("Size of dam in punjab : " + punjab.size());

		Collection<String> tamilNadu = new ArrayList<String>();
		tamilNadu.add("Mettur");
		tamilNadu.add("Solaiyar");
		tamilNadu.add("Bhavanisagar");
		System.out.println("Size of dam in tamilNadu : " + tamilNadu.size());

		Collection<String> uttarakhand = new ArrayList<String>();
		uttarakhand.add("Ramganga");
		uttarakhand.add("Jamrani ");
		uttarakhand.add("The Tehri");
		System.out.println("Size of dam in uttarakhand : " + uttarakhand.size());

		Collection<String> uttarPradesh = new ArrayList<String>();
		uttarPradesh.add("Rihand ");
		uttarPradesh.add("The Rajghat ");
		uttarPradesh.add("Matatila ");
		System.out.println("Size of dam in uttarPradesh : " + uttarPradesh.size());

		Collection<String> westBengal = new ArrayList<String>();
		westBengal.add("The Mukutmanipur");
		System.out.println("Size of dam in westBengal : " + westBengal.size());

		Collection<String> india = new ArrayList<String>();
		india.addAll(karnataka);
		india.addAll(rajasthan);
		india.addAll(andraPradesh);
		india.addAll(telangana);
		india.addAll(bihar);
		india.addAll(chhattisgarh);
		india.addAll(gujarat);
		india.addAll(himachalPradesh);
		india.addAll(jammuKashmir);
		india.addAll(Jharkhand);
		india.addAll(kerala);
		india.addAll(madhyaPradesh);
		india.addAll(maharashtra);
		india.addAll(odisha);
		india.addAll(punjab);
		india.addAll(tamilNadu);
		india.addAll(uttarakhand);
		india.addAll(uttarPradesh);
		india.addAll(westBengal);

		System.out.println("---------------Dam name is start with letter T--------------");
		Iterator<String> start = india.iterator();
		while (start.hasNext()) {
			String element = start.next();
			System.out.println(element);
			if (element.startsWith("T")) {
				System.out.println("----dams name start with T------ : " + element);

			}
		}
		System.out.println(System.lineSeparator());
		System.out.println("------------Dam name ending with letter ra-------------------");
		Iterator<String> ends = india.iterator();
		while (ends.hasNext()) {
			String element = ends.next();
			System.out.println(element);
			if (element.endsWith("ra")) {
				System.out.println("----dams name end with ra---- : " + element);

			}

		}
		System.out.println(System.lineSeparator());
		System.out.println("--------------------check the length of name------------------------");
		Iterator<String> length = india.iterator();
		while (length.hasNext()) {
			String element = length.next();
			System.out.println("***********************************************");
			System.out.println(element);
			if (element.length() < 15) {
				System.out.println("-----Dam name length is less than 15------:" + element);
			} else {
				System.err.println("-----Dam name length is more than 15-----:" + element);
			}
		}

		System.out.println(System.lineSeparator());
		System.out.println("------------Dam name is writing in UPPAR CASE-------------------");
		Iterator<String> upper = india.iterator();
		while (upper.hasNext()) {
			String element = upper.next();
			System.out.println(element.toUpperCase());
		}

		System.out.println(System.lineSeparator());
		System.out.println("------------Dam name is writing in LOWER CASE-------------------");
		Iterator<String> lower = india.iterator();
		while (lower.hasNext()) {
			String element = lower.next();
			System.out.println(element.toLowerCase());
		}
		System.out.println(System.lineSeparator());
		System.out.println("------contains------------");

		boolean contains = india.contains("Krishna Raja Sagara");
		System.out.println("contains Krishna Raja Sagara : " + contains);

		boolean contains1 = india.contains("Tungabhadra");
		System.out.println("contains Tungabhadra: " + contains1);

		boolean contains2 = india.contains("tunhadra");
		System.out.println("contains Tungabhadra: " + contains2);

		System.out.println(System.lineSeparator());
		System.out.println("------contains------------");
		if (india.contains("Krishna Raja Sagara")) {
			System.out.println("Krishna Raja Sagara is present");
		} else {
			System.out.println("Krishna Raja Sagara is not present");
		}
		
		if (india.contains("Tungabhadra")) {
			System.out.println("Tungabhadra is present");
		} else {
			System.out.println("Tungabhadra is not present");
		}
		
		

		Iterator<String> pall = india.iterator();
		while (pall.hasNext()) {
			String element = pall.next();
			// System.out.println(element);
			int value = element.length();
			for (int i = (value) - 1; i >= 0; i--) {
				reverse = reverse + element.charAt(i);
				if (element.toLowerCase().equals(reverse.toLowerCase())) {
					System.out.println("element name is a pallandrom :" + element);
				} else {
					System.err.println("element is not a pallandrom :" + element);

				}
			}

		}
	}
}
