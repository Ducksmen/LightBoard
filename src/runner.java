public class runner {

    public static void main(String[] args)
    {
        LightBoard l = new LightBoard(3,3);
        for (int i = 0; i < l.lights.length; i++) {
            for (int j = 0; j < l.lights[i].length; j++) {

                if (l.lights[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }

            }
            System.out.println();
        }
        System.out.println(l.evaluateLight(0,2));
        System.out.println(l.evaluateLight(1,0));
        System.out.println(l.evaluateLight(2,1));
        System.out.println(l.evaluateLight(2,2));
    }
}
