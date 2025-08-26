class verCarro{
    public static void main(String[] args) {
        Motor aMotor=new Motor("1.8L I4 hybrid", 121);
        Motor bMotor=new Motor("6.2L V8", 455);
        Carro a=new Carro("Toyota Corolla Hybrid", 2022, 
        aMotor);
        Carro b=new Carro("Chevrolet Camaro SS", 2018,
        bMotor);

        Carro[] vCars=new Carro[5];
           
        Garagem testGaragem=new Garagem("Garagem do Sérgio", vCars);
        
        testGaragem.addCarro(a);
        testGaragem.addCarro(b);

        testGaragem.listaG();

    }
}