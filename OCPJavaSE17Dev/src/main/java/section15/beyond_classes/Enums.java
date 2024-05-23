package section15.beyond_classes;

public class Enums {
    /*
    enum Compass{
        NORTH, SOUTH, EAST, WEST
    };
     */

    /*
    enum Compass{
        NORTH("Going up"), SOUTH("Going down"), EAST("Going right"), WEST("Going left");
        private final String instruction;
        Compass(String instruction) {
            this.instruction = instruction;
        }

        public String getInstruction() {
            return instruction;
        }
    }
     */
    /*
    enum Compass {
        NORTH{
            public String getDirection(){
                return "Going up";
            }
        },
        SOUTH{
            public String getDirection(){
                return "Going down";
            }
        },
        WEST{
            public String getDirection(){
                return "Going left";
            }
        },
        EAST//{
            //public String getDirection(){
            //    return "Going right";
           //}
        //}
        ;

        //public abstract String getDirection();
        public String getDirection(){
            return "Sideways";
        }
    }
    */
    interface Planet{
        String getPlanet();
    }

    enum Compass implements Planet{
        EAST, WEST, NORTH, SOUTH;

        @Override
        public String getPlanet() {
            return "Earth";
        }
    }


    public static void main(String[] args) {
        //Compass N = Compass.NORTH;
        /*
        System.out.println(N);

        for(var direction : Compass.values()){
            System.out.println(" "+direction.ordinal() + ": "+direction.name());
        }
         */

        /*
        switch(N){
            case NORTH -> System.out.println("Going up");
            case SOUTH -> System.out.println("Going down");
            default -> System.out.println("Going sideways");
        }
         */

        /*
        Compass N = Compass.NORTH;
        System.out.println(N);
        System.out.println(N.getInstruction());
         */

        //Compass north = Compass.NORTH;
        /*
        Compass c = Compass.EAST;
        System.out.println(c.getDirection());
         */

        System.out.println(Compass.NORTH.getPlanet());
    }
}
