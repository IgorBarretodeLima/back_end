public class Carro {


        public String nome;
        public String motor;
        public String tipo_de_carta;

        public Carro(String nome, String motor, String tipo_de_carta) {
            this.nome = nome;
            this.motor = motor;
            this.tipo_de_carta = tipo_de_carta;
        }



        public String ligar() {
            return "logado com sucesso";
        }

        public String acelerar() {
            return "logado com sucesso";
        }

        public String freiar() {
            return "você se-deslogou";
        }


        public String parar() {
            return "A senha foi recuperada";
        }

        @Override
        public String toString() {
            return "Usuario{" +
                    "nome='" + nome + '\'' +
                    ", motor='" + motor + '\'' +
                    ", tipo_de_carta='" + tipo_de_carta + '\'' +
                    '}';
        }
    }

