package ware.lang.design.node;

/**
 * 对节点的处理<br>
 * 对 上级，下级，前驱，后续节点的包装和解包
 * @author yanchangyou
 *
 */
public interface Operate {

	/**
	 * 包装上级节点
	 * @param packageNode
	 */
	public void packageSupNode(PackageNode packageNode);
	
	/**
	 * 解包上级节点
	 */
	public void unPackageSupNode();

	/**
	 * 包装下级节点
	 * @param packageNode
	 */
	public void packageSubNode(PackageNode packageNode);
	
	/**
	 * 解包下级节点
	 */
	public void unPackageSubNode();

	/**
	 * 包装前驱节点
	 * @param packageNode
	 */
	public void packagePreNode(PackageNode packageNode);
	
	/**
	 * 解包前驱节点
	 */
	public void unPackagePreNode();

	/**
	 * 包装后续节点
	 * @param packageNode
	 */
	public void packageNextNode(PackageNode packageNode);
	
	/**
	 * 解包后续节点
	 */
	public void unPackageNextNode();
	
//	public void moveToSup();

}
