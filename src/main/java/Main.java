public class Main {
    static public Matriz matriz = new Matriz(20, 20);
    public static void main(String[] args){
        Matriz m = new Matriz(20,20);

        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,0);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,1);
        m.setCelula(new Terreno(TipoTerreno.HOSPITAL), 0,2);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,3);
        m.setCelula(new Rua(), 0,4);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,5);
        m.setCelula(new , 0,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,7);
        m.setCelula(new , 0,8);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,9);
        m.setCelula(new , 0,10);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,11);
        m.setCelula(new , 0,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 0,19);

        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 1,0);
        m.setCelula(new Rua(), 1,1);
        m.setCelula(new Rua(), 1,2);
        m.setCelula(new Rua(), 1,3);
        m.setCelula(new Rua(), 1,4);
        m.setCelula(new Rua(), 1,5);
        m.setCelula(new Rua(), 1,6);
        m.setCelula(new Rua(), 1,7);
        m.setCelula(new Rua(), 1,8);
        m.setCelula(new Rua(), 1,9);
        m.setCelula(new Rua(), 1,10);
        m.setCelula(new Rua(), 1,11);
        m.setCelula(new Rua(), 1,12);
        m.setCelula(new Rua(), 1,13);
        m.setCelula(new Rua(), 1,14);
        m.setCelula(new Rua(), 1,15);
        m.setCelula(new Rua(), 1,16);
        m.setCelula(new Rua(), 1,17);
        m.setCelula(new Rua(), 1,18);
        m.setCelula(new Rua(), 1,19);

        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,0);
        m.setCelula(new Rua(), 2,1);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,2);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,3);
        m.setCelula(new Rua(), 2,4);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,5);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,8);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,10);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,13);
        m.setCelula(new Rua(), 2,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 2,18);
        m.setCelula(new Rua(), 2,19);

        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,0);
        m.setCelula(new Rua(0), 3,1);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,2);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,3);
        m.setCelula(new Rua(), 3,4);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,5);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,8);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,10);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,13);
        m.setCelula(new Rua(0), 3,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 3,18);
        m.setCelula(new Rua(), 3,19);

        m.setCelula(new , 4,0);
        m.setCelula(new Rua(), 4,1);
        m.setCelula(new Rua(1), 4,2);
        m.setCelula(new Rua(), 4,3);
        m.setCelula(new Rua(), 4,4);
        m.setCelula(new Rua(), 4,5);
        m.setCelula(new Rua(), 4,6);
        m.setCelula(new Rua(), 4,7);
        m.setCelula(new Rua(), 4,8);
        m.setCelula(new Rua(), 4,9);
        m.setCelula(new Rua(), 4,10);
        m.setCelula(new Rua(), 4,11);
        m.setCelula(new Rua(), 4,12);
        m.setCelula(new Rua(3), 4,13);
        m.setCelula(new Rua(), 4,14);
        m.setCelula(new Rua(1), 4,15);
        m.setCelula(new Rua(), 4,16);
        m.setCelula(new Rua(), 4,17);
        m.setCelula(new Rua(), 4,18);
        m.setCelula(new Rua(), 4,19);

        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,0);
        m.setCelula(new Rua(2), 5,1);
        m.setCelula(new , 5,2);
        m.setCelula(new , 5,3);
        m.setCelula(new , 5,4);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,5);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,8);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,10);
        m.setCelula(new Rua(), 5,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,13);
        m.setCelula(new , 5,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 5,19);

        m.setCelula(new Rua(), 6,0);
        m.setCelula(new Rua(), 6,1);
        m.setCelula(new , 6,2);
        m.setCelula(new , 6,3);
        m.setCelula(new , 6,4);
        m.setCelula(new , 6,5);
        m.setCelula(new , 6,6);
        m.setCelula(new , 6,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,8);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,9);
        m.setCelula(new , 6,10);
        m.setCelula(new Rua(), 6,11);
        m.setCelula(new , 6,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 6,19);

        m.setCelula(new Rua(), 7,0);
        m.setCelula(new , 7,1);
        m.setCelula(new , 7,2);
        m.setCelula(new , 7,3);
        m.setCelula(new , 7,4);
        m.setCelula(new , 7,5);
        m.setCelula(new , 7,6);
        m.setCelula(new , 7,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,8);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,10);
        m.setCelula(new Rua(), 7,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 7,19);

        m.setCelula(new Rua(), 8,0);
        m.setCelula(new , 8,1);
        m.setCelula(new , 8,2);
        m.setCelula(new , 8,3);
        m.setCelula(new , 8,4);
        m.setCelula(new , 8,5);
        m.setCelula(new , 8,6);
        m.setCelula(new , 8,7);
        m.setCelula(new , 8,8);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,9);
        m.setCelula(new , 8,10);
        m.setCelula(new Rua(), 8,11);
        m.setCelula(new , 8,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 8,19);

        m.setCelula(new Rua(), 9,0);
        m.setCelula(new , 9,1);
        m.setCelula(new , 9,2);
        m.setCelula(new , 9,3);
        m.setCelula(new , 9,4);
        m.setCelula(new , 9,5);
        m.setCelula(new , 9,6);
        m.setCelula(new , 9,7);
        m.setCelula(new , 9,8);
        m.setCelula(new , 9,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,10);
        m.setCelula(new Rua(), 9,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 9,19);

        m.setCelula(new Rua(), 10,0);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,1);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,2);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,3);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,4);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,5);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,6);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,7);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,8);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,9);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 10,10);
        m.setCelula(new Rua(), 10,11);
        m.setCelula(new Rua(), 10,12);
        m.setCelula(new Rua(), 10,13);
        m.setCelula(new Rua(), 10,14);
        m.setCelula(new Rua(), 10,15);
        m.setCelula(new Rua(), 10,16);
        m.setCelula(new Rua(), 10,17);
        m.setCelula(new Rua(), 10,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 10,19);

        m.setCelula(new Rua(), 11,0);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,1);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,2);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,3);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,4);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,5);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,6);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,7);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,8);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,9);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,10);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,11);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,12);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,13);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,14);
        m.setCelula(new Terreno(TipoTerreno.AGUA), 11,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 11,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 11,17);
        m.setCelula(new Rua(), 11,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 11,19);

        m.setCelula(new , 12,0);
        m.setCelula(new , 12,1);
        m.setCelula(new , 12,2);
        m.setCelula(new , 12,3);
        m.setCelula(new , 12,4);
        m.setCelula(new , 12,5);
        m.setCelula(new , 12,6);
        m.setCelula(new , 12,7);
        m.setCelula(new , 12,8);
        m.setCelula(new , 12,9);
        m.setCelula(new , 12,10);
        m.setCelula(new , 12,11);
        m.setCelula(new , 12,12);
        m.setCelula(new , 12,13);
        m.setCelula(new , 12,14);
        m.setCelula(new , 12,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 12,16);
        m.setCelula(new , 12,17);
        m.setCelula(new , 12,18);
        m.setCelula(new , 12,19);

        m.setCelula(new , 13,0);
        m.setCelula(new , 13,1);
        m.setCelula(new , 13,2);
        m.setCelula(new , 13,3);
        m.setCelula(new , 13,4);
        m.setCelula(new , 13,5);
        m.setCelula(new , 13,6);
        m.setCelula(new , 13,7);
        m.setCelula(new , 13,8);
        m.setCelula(new , 13,9);
        m.setCelula(new , 13,10);
        m.setCelula(new , 13,11);
        m.setCelula(new , 13,12);
        m.setCelula(new , 13,13);
        m.setCelula(new , 13,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 13,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 13,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 13,17);
        m.setCelula(new , 13,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 13,19);

        m.setCelula(new , 14,0);
        m.setCelula(new , 14,1);
        m.setCelula(new , 14,2);
        m.setCelula(new , 14,3);
        m.setCelula(new , 14,4);
        m.setCelula(new , 14,5);
        m.setCelula(new , 14,6);
        m.setCelula(new , 14,7);
        m.setCelula(new , 14,8);
        m.setCelula(new , 14,9);
        m.setCelula(new , 14,10);
        m.setCelula(new , 14,11);
        m.setCelula(new , 14,12);
        m.setCelula(new , 14,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 14,14);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 14,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 14,16);
        m.setCelula(new , 14,17);
        m.setCelula(new , 14,18);
        m.setCelula(new , 14,19);

        m.setCelula(new , 15,0);
        m.setCelula(new , 15,1);
        m.setCelula(new , 15,2);
        m.setCelula(new , 15,3);
        m.setCelula(new , 15,4);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,5);
        m.setCelula(new Terreno(TipoTerreno.HOSPITAL), 15,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,8);
        m.setCelula(new , 15,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,10);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,14);
        m.setCelula(new , 15,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,17);
        m.setCelula(new , 15,18);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 15,19);

        m.setCelula(new , 16,0);
        m.setCelula(new , 16,1);
        m.setCelula(new , 16,2);
        m.setCelula(new , 16,3);
        m.setCelula(new , 16,4);
        m.setCelula(new , 16,5);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 16,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 16,7);
        m.setCelula(new , 16,8);
        m.setCelula(new , 16,9);
        m.setCelula(new , 16,10);
        m.setCelula(new , 16,11);
        m.setCelula(new , 16,12);
        m.setCelula(new , 16,13);
        m.setCelula(new , 16,14);
        m.setCelula(new , 16,15);
        m.setCelula(new , 16,16);
        m.setCelula(new , 16,17);
        m.setCelula(new , 16,18);
        m.setCelula(new , 16,19);

        m.setCelula(new , 17,0);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,1);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,2);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,3);
        m.setCelula(new , 17,4);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,5);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,8);
        m.setCelula(new , 17,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,10);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,14);
        m.setCelula(new , 17,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,16);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 17,18);
        m.setCelula(new , 17,19);

        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,0);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,1);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,2);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,3);
        m.setCelula(new , 18,4);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,5);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,6);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,7);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,8);
        m.setCelula(new , 18,9);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,10);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,11);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,12);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,13);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,14);
        m.setCelula(new , 18,15);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,16);
        m.setCelula(new Terreno(TipoTerreno.HOSPITAL), 18,17);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 18,18);
        m.setCelula(new , 18,19);

        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 19,0);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 19,1);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 19,2);
        m.setCelula(new Terreno(TipoTerreno.SIMPLES), 19,3);
        m.setCelula(new Rua(), 19,4);
        m.setCelula(new Rua(), 19,5);
        m.setCelula(new Rua(), 19,6);
        m.setCelula(new Rua(), 19,7);
        m.setCelula(new Rua(), 19,8);
        m.setCelula(new Rua(), 19,9);
        m.setCelula(new Rua(), 19,10);
        m.setCelula(new Rua(), 19,11);
        m.setCelula(new Rua(), 19,12);
        m.setCelula(new Rua(), 19,13);
        m.setCelula(new Rua(), 19,14);
        m.setCelula(new Rua(), 19,15);
        m.setCelula(new Rua(), 19,16);
        m.setCelula(new Rua(), 19,17);
        m.setCelula(new Rua(), 19,18);
        m.setCelula(new Rua(), 19,19);

        m.printMatriz();
    }
}
