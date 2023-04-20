package j_oop.java_ComplexNumberSOLID;


public class ComplexNumberFactory {
    public ComplexNumber createComplexNumber(double real, double imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}
/**
 * Класс ComplexNumberFactory будет использоваться для создания объектов класса ComplexNumber, 
 * что позволит нам абстрагироваться от процесса создания объектов и обеспечить гибкость в будущем. 
 * Для этого мы можем использовать паттерн "Фабричный метод"
 */