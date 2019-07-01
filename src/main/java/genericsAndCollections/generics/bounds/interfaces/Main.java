package genericsAndCollections.generics.bounds.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public void anyFlyer(List<Flyer> flyer) {

	}

	public void groupOfFlyers(List<? extends Flyer> flyer) {

	}

	public void main() {
		List<Flyer> x = new ArrayList<>();
		anyFlyer(x);
		groupOfFlyers(x);

		List<HangGlider> y = new ArrayList<>();
		// anyFlyer(x); This won't compile, as a List<HangGlider> is not a List<Flyer>
		groupOfFlyers(y);
	}

}
