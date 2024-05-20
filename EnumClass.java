enum Laptop{
    //	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
        Mackbook(2000,10), XPS(2200,18), Surface, ThinkPad(1800,19);
        
        private int price;
        int age ;
        private Laptop()
        {
            price=500;
        }
        
        private Laptop(int price,int age)
        {
            this.price=price;
            this.age=age;
            System.out.println("in Laptop" + this.name());
        }
        
        public int getPrice()
        {
            return price;
        }
        public int getAge()
        {
            return age;
        }
        public void setPrice(int price)
        {
            this.price=price;
            
            //System.out.println("in Laptop" + this.name());
        }
        public void setAge(int age)
        {
            this.age=age;
            
            //System.out.println("in Laptop" + this.name());
        }
    }
    
    public class EnumClass {
        public static void main(String[] args) {
    
    //    	Laptop lap=Laptop.Mackbook;
    //    	System.out.println(lap+ " : "+lap.getPrice());
            
            for(Laptop lap : Laptop.values())
            {
                System.out.println(lap+" : "+lap.getPrice()+": " +lap.getAge());
            }

            Laptop l = Laptop.Mackbook;
            l.setAge(15);
            System.out.println(l.getAge());
            System.out.println(l.getPrice());

            for(Laptop lap : Laptop.values())
            {
                System.out.println(lap+" : "+lap.getPrice()+": " +lap.getAge());
            }
        }
    }
    