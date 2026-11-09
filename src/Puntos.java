import java.util.Scanner;
public class Puntos {
    public void punto0() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("hola " + nombre);

        scanner.close();
    }

    void punto1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer texto : ");
        String texto1 = scanner.nextLine();

        System.out.println("Ingresa el segundo texto : ");
        String texto2 = scanner.nextLine();

        System.out.println(texto1 + " " + texto2);
        scanner.close();
    }

    void punto3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();

        int cuadrado = numero * numero;
        System.out.println("El resultado es: " + cuadrado);

        scanner.close();
    }

    void punto4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero : ");
        int num1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero : ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("el resultado es: " + suma);

        scanner.close();
    }

    void punto5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero : ");
        int num1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero : ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("el resultado es: " + suma);

        scanner.close();
    }

    void punto6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("División entera: " + (num1 / num2));
            System.out.println("Residuo: " + (num1 % num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
        scanner.close();
    }

    void punto7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero (simulando la parte entera): ");
        int parteEntera = scanner.nextInt();
        System.out.println("Ingrese la parte decimal (como número entero, ej: 45): ");
        int parteDecimal = scanner.nextInt();

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
        scanner.close();
    }

    int calcularPromedio(int n1, int n2, int n3, int n4, int n5) {
        return (n1 * 15 + n2 * 20 + n3 * 15 + n4 * 30 + n5 * 20) / 100;
    }

    void punto8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota 1 (entero): ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese la nota 2 (entero): ");
        int n2 = scanner.nextInt();
        System.out.println("Ingrese la nota 3 (entero): ");
        int n3 = scanner.nextInt();
        System.out.println("Ingrese la nota 4 (entero): ");
        int n4 = scanner.nextInt();
        System.out.println("Ingrese la nota 5 (entero): ");
        int n5 = scanner.nextInt();

        int notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("La nota final es: " + notaFinal);
        scanner.close();
    }

    int calcularIVA(int precioBruto) {
        return (precioBruto * 119) / 100;
    }

    void punto9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio bruto (valor original entero): ");
        int precioBruto = scanner.nextInt();

        int precioConIVA = calcularIVA(precioBruto);
        int valorIVA = precioConIVA - precioBruto;

        System.out.println("Valor original (precio bruto): " + precioBruto);
        System.out.println("Valor del IVA (19%): " + valorIVA);
        System.out.println("Valor de la venta con IVA incluido: " + precioConIVA);
        scanner.close();
    }

    void punto10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo (entero): ");
        int radio = scanner.nextInt();

        // Usando aproximación con enteros para Pi (Pi * 100 = 314)
        int area = (314 * radio * radio) / 100;
        int perimetro = (2 * 314 * radio) / 100;

        System.out.println("Área aproximada del círculo: " + area);
        System.out.println("Perímetro aproximado del círculo: " + perimetro);
        scanner.close();
    }

    void punto11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado del hexágono (entero): ");
        int lado = scanner.nextInt();

        // Aproximando sqrt(3) * 100 = 173 para evitar decimales
        int area = (3 * 173 * lado * lado) / 200;

        System.out.println("El área aproximada del hexágono es: " + area);
        scanner.close();
    }

    void punto12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números (n): ");
        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el número entero " + i + ": ");
            suma += scanner.nextInt();
        }

        int promedio = (n > 0) ? (suma / n) : 0;
        System.out.println("El promedio entero de los " + n + " números es: " + promedio);
        scanner.close();
    }

    void punto13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese x1 (entero): ");
        int x1 = scanner.nextInt();
        System.out.println("Ingrese y1 (entero): ");
        int y1 = scanner.nextInt();
        System.out.println("Ingrese x2 (entero): ");
        int x2 = scanner.nextInt();
        System.out.println("Ingrese y2 (entero): ");
        int y2 = scanner.nextInt();

        int difX = x2 - x1;
        int difY = y2 - y1;
        int sumaCuadrados = (difX * difX) + (difY * difY);
        int distancia = (int) Math.sqrt(sumaCuadrados);
        System.out.println("La distancia entera aproximada es: " + distancia);
        scanner.close();
    }

    void punto14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dígito (n): ");
        int n = scanner.nextInt();

        int num1 = n;
        int num2 = n * 10 + n;
        int num3 = n * 100 + n * 10 + n;

        int suma = num1 + num2 + num3;

        System.out.println("Números generados: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("La suma de ellos es: " + suma);
        scanner.close();
    }

    void punto15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos (entero): ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("Resultado --> %02d:%02d:%02d\n", horas, minutos, segundos);
        scanner.close();
    }

    void punto16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        scanner.close();
    }

    void punto17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        scanner.close();
    }

    void punto18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la venta (precio bruto): ");
        int precioBruto = scanner.nextInt();

        int precioConIVA = calcularIVA(precioBruto);

        if (precioBruto > 150000) {
            // Aplicar 5% de descuento sobre el precio con IVA
            precioConIVA = precioConIVA - (precioConIVA * 5) / 100;
            System.out.println("Se aplicó un 5% de descuento por ser mayor a 150.000.");
        }

        System.out.println("El valor final con IVA (y descuento si aplica) es: " + precioConIVA);
        scanner.close();
    }

    void punto19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota 1 (entero): ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese la nota 2 (entero): ");
        int n2 = scanner.nextInt();
        System.out.println("Ingrese la nota 3 (entero): ");
        int n3 = scanner.nextInt();
        System.out.println("Ingrese la nota 4 (entero): ");
        int n4 = scanner.nextInt();
        System.out.println("Ingrese la nota 5 (entero): ");
        int n5 = scanner.nextInt();

        int notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("La nota final es: " + notaFinal);

        if (notaFinal < 2) {
            System.out.println("No puede habilitar.");
        } else if (notaFinal < 3) {
            System.out.println("Reprobó.");
        } else {
            System.out.println("Aprobó.");
            if (notaFinal > 4) { // Ajustado a entero cercano a 4.5
                System.out.println("¡Felicitaciones al estudiante!");
            }
        }
        scanner.close();
    }

    void punto20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese b: ");
        int b = scanner.nextInt();
        System.out.println("Ingrese c: ");
        int c = scanner.nextInt();

        int discriminante = (b * b) - (4 * a * c);

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales (usando enteros).");
        } else {
            int raizDisc = (int) Math.sqrt(discriminante);
            if (2 * a != 0) {
                int x1 = (-b + raizDisc) / (2 * a);
                int x2 = (-b - raizDisc) / (2 * a);
                System.out.println("Solución x1: " + x1);
                System.out.println("Solución x2: " + x2);
            } else {
                System.out.println("División por cero en el denominador.");
            }
        }
        scanner.close();
    }

    void punto21() {
        Scanner scanner = new Scanner(System.in);
        String usuarioPred = "carlos";
        String passPred = "1234";

        System.out.println("Ingrese su usuario: ");
        String usuarioIngresado = scanner.next();
        System.out.println("Ingrese su contraseña: ");
        String passIngresada = scanner.next();

        if (usuarioIngresado.equals(usuarioPred) && passIngresada.equals(passPred)) {
            System.out.println("Acceso concedido. ¡Bienvenido!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
        scanner.close();
    }

    void punto22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 10: ");
        int num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
            default:
                System.out.println("Número fuera de rango.");
        }
        scanner.close();
    }

    void punto23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número menor a 100.000: ");
        int num = scanner.nextInt();

        String strNum = Integer.toString(num);
        System.out.println("El número tiene " + strNum.length() + " dígitos.");
        scanner.close();
    }

    void punto24() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int n3 = scanner.nextInt();

        if (n1 < n2 && n2 < n3) {
            System.out.println("Está incrementando.");
        } else if (n1 > n2 && n2 > n3) {
            System.out.println("Está disminuyendo.");
        } else {
            System.out.println("Ni se incrementa ni se disminuye.");
        }
        scanner.close();
    }

    void punto25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número del día de la semana (entre 1 y 7): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("1 ---> Lunes");
                break;
            case 2:
                System.out.println("2 ---> Martes");
                break;
            case 3:
                System.out.println("3 ---> Miércoles");
                break;
            case 4:
                System.out.println("4 ---> Jueves");
                break;
            case 5:
                System.out.println("5 ---> Viernes");
                break;
            case 6:
                System.out.println("6 ---> Sábado");
                break;
            case 7:
                System.out.println("7 ---> Domingo");
                break;
            default:
                System.out.println("Número de día inválido.");
        }
        scanner.close();
    }

    void punto26() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto largo: ");
        String texto = scanner.nextLine();

        System.out.println("Texto ingresado (sin invertir): " + texto);
        System.out.println("Cantidad de caracteres: " + texto.length());
        scanner.close();
    }

    void punto27() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto largo: ");
        String texto = scanner.nextLine();

        String[] palabras = texto.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                String palabraCap = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
                resultado.append(palabraCap).append(" ");
            }
        }
        System.out.println("Resultado: " + resultado.toString().trim());
        scanner.close();
    }

    void punto28() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto largo: ");
        String texto = scanner.nextLine().trim();

        String[] palabras = texto.split("\\s+");
        if (palabras.length >= 2) {
            System.out.println("La penúltima palabra es: " + palabras[palabras.length - 2]);
        } else {
            System.out.println("El texto no tiene suficientes palabras para determinar una penúltima.");
        }
        scanner.close();
    }

    void punto29() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el texto principal: ");
        String texto2 = scanner.nextLine();
        System.out.println("Ingrese el texto a buscar: ");
        String texto1 = scanner.nextLine();

        System.out.println(texto2.contains(texto1));
        scanner.close();
    }

    void punto30() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        int resultado = verificarPalindromo(palabra);
        System.out.println(resultado);
        scanner.close();
    }

    int verificarPalindromo(String palabra) {
        int inicio = 0;
        int fin = palabra.length() - 1;
        while (inicio < fin) {
            char c1 = palabra.charAt(inicio);
            char c2 = palabra.charAt(fin);
            if (c1 >= 'A' && c1 <= 'Z') {
                c1 = (char) (c1 + 32);
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char) (c2 + 32);
            }
            if (c1 == ' ') {
                inicio++;
                continue;
            }
            if (c2 == ' ') {
                fin--;
                continue;
            }
            if (c1 != c2) {
                return 0; // No es palíndromo
            }
            inicio++;
            fin--;
        }
        return 1; // Sí es palíndromo
    }

    void punto31() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de lados del polígono regular: ");
        int nLados = scanner.nextInt();
        System.out.println("Ingrese la longitud de cada lado (entero): ");
        int longitudLado = scanner.nextInt();
        System.out.println("Ingrese el apotema (entero): ");
        int apotema = scanner.nextInt();

        int area = calcularAreaPoligono(nLados, longitudLado, apotema);
        System.out.println("El área aproximada del polígono es: " + area);
        scanner.close();
    }

    int calcularAreaPoligono(int nLados, int longitudLado, int apotema) {
        int perimetro = nLados * longitudLado;
        return (perimetro * apotema) / 2;
    }

    void punto32() {
        System.out.println("Los 10 primeros números naturales:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void punto33() {
        System.out.println("Los primeros 10 números naturales impares:");
        for (int i = 1, contador = 0; contador < 10; i += 2, contador++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void punto34() {
        System.out.println("Los primeros 10 números naturales pares:");
        for (int i = 2, contador = 0; contador < 10; i += 2, contador++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void punto35() {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero <= 0) {
            System.out.println("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Valor no permitido. Debe ser mayor a 0.");
            }
        }
        System.out.println("Valor válido ingresado: " + numero);
        scanner.close();
    }

    void punto36() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número decimal (entero): ");
        int decimal = scanner.nextInt();

        String binario = Integer.toBinaryString(decimal);
        System.out.println("El número en binario es: " + binario);
        scanner.close();
    }

    void punto37() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número binario (ej: 1010): ");
        String binario = scanner.next();

        int decimal = 0;
        int longitud = binario.length();
        for (int i = 0; i < longitud; i++) {
            char c = binario.charAt(i);
            int valorBit = c - '0';
            decimal = decimal * 2 + valorBit;
        }

        System.out.println("El número en decimal es: " + decimal);
        scanner.close();
    }

    void punto38() {
        System.out.println("Imprimiendo patrón:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void punto39() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        scanner.close();
    }

    void punto40() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
    void problemaFinalBoeing() {
        Scanner scanner = new Scanner(System.in);
        int capacidadMaxAvion = 18000;
        int pesoTotalCarga = 0;
        int totalBultos = 0;
        int pesoMasPesado = 0;
        int pesoMasLiviano = 501; // Inicializado por encima del límite permitido
        int sumaPesos = 0;
        int ingresoPesos = 0;

        System.out.println("--- Control de Equipaje Boeing 747 ---");
        System.out.println("Ingrese 0 en el peso para terminar el ingreso.");

        int pesoBulto = 1; // Para entrar al ciclo
        while (pesoBulto != 0) {
            System.out.println("Ingrese el peso del bulto en Kg (máximo 500 Kg): ");
            pesoBulto = scanner.nextInt();
            if (pesoBulto == 0) {
                break;
            }
            if (pesoBulto < 0 || pesoBulto > 500) {
                System.out.println("Peso no permitido. Debe ser entre 1 y 500 Kg.");
                continue;
            }
            if ((pesoTotalCarga + pesoBulto) > capacidadMaxAvion) {
                System.out.println("El bulto supera la capacidad restante de carga del avión. No se puede aceptar.");
                continue;
            }
            // Procesar bulto válido
            pesoTotalCarga += pesoBulto;
            totalBultos++;
            sumaPesos += pesoBulto;

            // Determinar más pesado y más liviano
            if (totalBultos == 1) {
                pesoMasPesado = pesoBulto;
                pesoMasLiviano = pesoBulto;
            } else {
                if (pesoBulto > pesoMasPesado) {
                    pesoMasPesado = pesoBulto;
                }
                if (pesoBulto < pesoMasLiviano) {
                    pesoMasLiviano = pesoBulto;
                }
            }

            // Calcular tarifa según reglas (trabajando con enteros)
            int tarifaBulto = 0;
            if (pesoBulto >= 26 && pesoBulto <= 300) {
                tarifaBulto = pesoBulto * 1500;
            } else if (pesoBulto >= 301 && pesoBulto <= 500) {
                tarifaBulto = pesoBulto * 2500;
            }
            ingresoPesos += tarifaBulto;
            System.out.println("Bulto aceptado. Tarifa de este bulto: $" + tarifaBulto);
        }
        int pesoPromedio = (totalBultos > 0) ? (sumaPesos / totalBultos) : 0;
        // Tasa de conversión entera aproximada a dólares (ej: 1 dólar = 4000 pesos)
        int ingresoDolares = (ingresoPesos > 0) ? (ingresoPesos / 4000) : 0;
        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("a. Número total de bultos ingresados: " + totalBultos);
        System.out.println("b. Peso del bulto más pesado: " + pesoMasPesado + " Kg");
        System.out.println("b. Peso del bulto más liviano: " + pesoMasLiviano + " Kg");
        System.out.println("c. Peso promedio de los bultos: " + pesoPromedio + " Kg");
        System.out.println("d. Ingreso total en pesos: $" + ingresoPesos);
        System.out.println("d. Ingreso total aproximado en dólares: $" + ingresoDolares);
        scanner.close();
    }
}