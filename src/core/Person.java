
package core;

/**
 *
 * @author afajardol
 */
public class Person {
    private String id;
    private String name;
    private String age;

    public Person(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
}
