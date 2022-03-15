public class Computer {
    String processor;
    int memory;

    Computer(String proc) {
        processor = proc;
        memory = 5625;
        System.out.println("Tworze nowy komputer");
    }

    void printInfo() {
        System.out.println(processor + ", " + memory);
    }
}