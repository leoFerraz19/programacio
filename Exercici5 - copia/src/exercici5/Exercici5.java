/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici5;

/**
 *
 * @author cep
 */
public class Exercici5 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

            //commit a netbeans
            
		float[] tempMitjana = {10, 13, 11, 24, 20, 22, 30, 32, 22, 18, 19, 15, 0};

		if (tempInfMitjana(tempMitjana) > 5) {
			System.out.println("\nWinter is Coming!!");
		}

	}

	public static int tempInfMitjana(float[] temperatura) {

		int mesos = 0;
		float mesCalid = 0;
		float mesFred = 999;
		float mitjana = 0;

		for (int i = 0; i < temperatura.length - 1; i++) {
			if (temperatura[i] > mesCalid) {
				mesCalid = temperatura[i];
				
			}
			if (temperatura[i] < mesFred) {
				mesFred = temperatura[i];
			}
		}
		
		for (int i = 0; i < temperatura.length-1; i++) {
			if (temperatura[i]==mesCalid) {
				System.out.println("El mes " + (i+1) + " és el més mes calid: " + mesCalid);
			}else if (temperatura[i]==mesFred) {
				System.out.println("El mes " + (i+1) + " és el més mes fred: " + mesFred);
			}
		}
		

		for (int i = 0; i < temperatura.length - 1; i++) {
			temperatura[12] = temperatura[i] + temperatura[12];
		}

		mitjana = temperatura[12] / 12;
		System.out.println("La temperatura mitjana de tot l'any: " + mitjana);

		for (int i = 0; i < temperatura.length - 1; i++) {
			if (temperatura[i] < temperatura[12]) {
				mesos++;
			}
		}

		return mesos;
	}
}
