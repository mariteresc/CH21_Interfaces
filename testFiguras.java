public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Cuadrado c1",10.0);
		Rectangulo r1 = new Rectangulo("Rectangulo r1",20.0,10.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1); 
		imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main


	public static void imprimirCalculo(FigurasGeometricas f) {
		System.out.println(f);
		System.out.println("+========================================");
		System.out.println("|El área de ["+f.getName()+"] es: " + f.calcularArea() + 
				"\n" + "|El perímetro de ["+f.getName()+"] es: " + f.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras