package org.ether.anima.weed;

/**
 * name : Ware.java<br>
 * 
 * ��ϵ :<br>
 * <ol>
 * 	<li>[ware��ϵ]��[ware]��[group]����, [group]����Ϊ: [group] = {ware*, group*}</li>
 *  <li>һ��ware����ֻ��һ�����⹫���˿�, ���ͨ���˶˿���ware��������ͨ��, ��˿ڿ���ͨ��[group]��ʵ��</li>
 *  <li>ware���������� : [����] --> [����] --> [����]</li>
 *  <li>��[����]�ڼ���[����]����ʶ������ֵ, ������ϵ����[����]��������Դ, [����]��[��Դ]������.</li> 
 * </ol>
 *
 *
 * @author yanchangyou
 * 
 */
public interface Ware {

	//================����===========
	/**
	 * ��ȡWare�Ķ˿�
	 * @return
	 */
	public int getPort();
	
	/**
	 * ��ȡ����
	 * @return
	 */
	public double getEnergy();
	
	/**
	 * ����:һ��ware�Ĳ���
	 */
	public void born();
	
	/**
	 * ���� : һ��ware������
	 */
	public void die();

	
	/**
	 * ���� : ware����
	 * ������һ�����ڵ�����, �����Լ�����, [����]��[����]��������
	 */
	//public void survive();
	
}
