package ware.lang.design.concept.ware;

import ware.lang.design.Entity;
import ware.lang.design.node.Element;

/**
 * 资源(resource)
 * @author yanchangyou
 * @date 2010-8-21 23:48:54
 * @version 1.1.0
 *
 */
public interface Resource extends WareConcept, Entity, Element {

	/**
	 * 按名获取resource
	 * @param name
	 * @return resource
	 */
	public Resource getResourceByName(String name);
	
}
