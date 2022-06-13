
public class Matematica {
	// treinar o conceito de sobrecarga
	// Nesse primeiro metodo chamado area, foi declarado que ele é um double e que irá calcular a área de um triângulo ao receber double x e y
	double area(double x, double y) {
		return x * y / 2;
		System.out.println("A área do seu triângulo é:" + area);
	}
	
	//  metodo que  possui o nome de area,  calcula a area de um quadrado e de um retangulo dependendo se o valores de x e y forem iguais ou nao
	// metodo e int
	int area(int x, int y) {
		if (x == y) {
			return x * x;
		} else {
			return x * y;
		}
	}
}
