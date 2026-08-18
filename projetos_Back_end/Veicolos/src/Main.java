import static java.lang.IO.*;
void main(){
    Carro carro = new Carro("kwid", "3 cilindro", "B");
    Carro carro2 = new Carro("doger","V6","B" );
    IO.println(carro);
    IO.println(carro2);
    println(carro.ligar());
    println(carro2.parar());


}
