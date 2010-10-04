package demo.helloworld;

import ware.core.context.WareContext;
import ware.core.drive.Driver;
import ware.core.exception.WareException;

public abstract class AbstractHellWorld implements Driver {

	public void dealWareException(WareException e) throws WareException,
			Exception {
		throw e;
	}

	public abstract void drive(WareContext context) throws WareException, Exception;

}
