package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @interface <AnnotationName>{
 * 	//some variables
 * }
 * 
 * 1) Marker Annotation       : It has no any variables in own definition.
 * 2) Single Value Annotation : only one values inside of it.
 * 3) Multi Value Annotation  : two or more variables 
 * 
 */


// Marker Annotation
@interface MyAnnotation1{
	
}

// Single Value Annotation
@interface MyAnnotation2{
	String str();
}

// Multi Value Annotation
@interface MyAnnotation3{
	String str();
	int a();
}

// Meta Annotaiton  
@Documented
@Inherited // If you want to be avaliable your annotation in the future extended class you must write this annotation.
@Target(ElementType.TYPE) // what level? (Class level, Method level, Field level, Contructor level)
@Retention(RetentionPolicy.RUNTIME) // source, runtime, class, etc.
@interface SmartPhone{
	String os() default "unknownOS";
	int version()  default 0;
}


@SmartPhone (os="Android", version=6)
class Samsung{
	
	String model;
	int size;
	
	Samsung(String model, int size){
		this.model = model;
		this.size = size;
	}
	
}

public class CreatingOwnAnnotationDemo {
	public static void main(String[] args) {
		
		Samsung phone = new Samsung("Note", 6);
		
		Class c = phone.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone) an;
		System.out.println(s.os());
		
		
		
		
	}

}
