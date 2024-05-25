
public class ParametrosInvalidosException  {

    void contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroUm < parametroDois) {

            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);

            }

        }else{
            throw new Exception();
        }
    }
}