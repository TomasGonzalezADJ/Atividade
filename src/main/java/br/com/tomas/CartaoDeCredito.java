import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            List<Double> compras = new ArrayList<>();
            var totalFatura = 0.0;
            var ultimaCompra = false;

            // Solicita valores de las compras y verifica si es la última compra
            while (!ultimaCompra) {
                System.out.print("Digite o valor da compra: ");
                var valorCompra = scanner.nextDouble();
                compras.add(valorCompra);
                totalFatura += valorCompra;

                System.out.print("É a última compra? (S/N): ");
                var resposta = scanner.next();
                ultimaCompra = resposta.equalsIgnoreCase("S");
            }

            // Pregunta el día de pago de la factura y valida el rango
            int diaPagamento = 0;
            boolean diaValido = false;

            while (!diaValido) {
                System.out.print("Digite o dia do pagamento da fatura (1-31): ");
                diaPagamento = scanner.nextInt();

                if (diaPagamento >= 1 && diaPagamento <= 31) {
                    diaValido = true;
                } else {
                    System.out.println("Erro: O dia do pagamento deve estar entre 1 e 31. Tente novamente.");
                }
            }

            // Calcula intereses si el pago es después del día 25
            var juros = 0.0;
            if (diaPagamento > 25) {
                juros = totalFatura * 0.03; // Intereses de 3%
                juros += (diaPagamento - 25) * (totalFatura * 0.01); // Intereses de 1% por día adicional
            }

            // Muestra el resultado
            var valorTotal = totalFatura + juros;
            System.out.printf("Valor total da fatura: R$ %.2f\n", totalFatura);
            System.out.printf("Juros aplicados: R$ %.2f\n", juros);
            System.out.printf("Valor a pagar: R$ %.2f\n", valorTotal);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
