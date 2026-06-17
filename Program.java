package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// Caminho do arquivo
		String path = "C:\\Windows\\Temp\\in.txt";
		
		// Criando as variaveis; Declarando as Streams
		FileReader fr = null;
		BufferedReader br = null;
		
		// Bloco try para tentar abrir o arquivo e ler o conteudo
		try {
			// Instanciando o FileReader e passando o caminho como argumento
			fr = new FileReader(path);
			// Instanciando o BufferedReader e passando o FileReader como argumento
			br = new BufferedReader(fr);
			
			// Exemplo na mesma linha; br = new BufferedReader(new FileReader(path));
			// O BufferedReader é instanciado a partir do FileReader.
			
			// Criando um variavel e passando o comando para ler uma linha do arquivo
			String line = br.readLine();
			
			// Enquanto a variavel Line não retornar null, ele le novamente. 
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} // Capturando uma possivel exceção
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} // Fechando as streams
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();

			}
		}
	}
}
