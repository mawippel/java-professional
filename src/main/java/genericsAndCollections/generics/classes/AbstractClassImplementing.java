package genericsAndCollections.generics.classes;

/**
 * The types have to be the same, as both are named as 'U' 
 */
public abstract class AbstractClassImplementing<U> implements InterfaceExample<U> {

	@Override
	public void ship(U t) {

	}

}
