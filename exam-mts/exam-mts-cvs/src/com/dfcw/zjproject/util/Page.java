/**  
 * File name : Page.java  
 * Write date : 2002-5-29  
 * Writer : alexander  
 * Copyright 2002 cwap.com, Inc. All rights reserved.  
 */
package com.dfcw.zjproject.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.Serializable;
/**
 * ������ʾ�������ҳ��
 */
public class Page implements Serializable {
	/**
	 * ��ʼ��¼�ţ���0��ʼ
	 */
	public int start;
	/**
	 * ������¼��
	 */
	public int end;
	/**
	 * ��ʾ��ҳ�濪ʼ��¼�ţ���1��ʼ
	 */
	public int viewStart;
	/**
	 * ��ʾ��ҳ�������¼��
	 */
	public int viewEnd;
	/**
	 * �Ƿ�����һҳ�Ŀ���
	 */
	public boolean hasPrevious;
	/**
	 * ��һҳ��ҳ��
	 */
	public int previousPageNumber;
	/**
	 * �Ƿ�����һҳ�Ŀ���
	 */
	public boolean hasNext;
	/**
	 * ��һҳ��ҳ��
	 */
	public int nextPageNumber;
	/**
	 * һ���ж����м�¼
	 */
	public int total;
	/**
	 * һ���ж���ҳ
	 */
	public int totalPage;
	/**
	 * ��ǰ�ǵڼ�ҳ
	 */
	public int currentPageNumber;
	/**
	 * ÿҳ�ж�����
	 */
	public int pageSize;
	/**
	 * ������,����ҳ��
	 * 
	 * @param: l �����
	 * @param: num ��ǰ�ǵڼ�ҳ
	 * @param: size ÿҳ�ж�����
	 * @param: total һ���ж����м�¼
	 */
	public Page(int num, int size, int total) {
		this.currentPageNumber = num;
		this.pageSize = size;
		this.total = total;
		if (total == 0)
			this.currentPageNumber = 0;
		else
			autoCalculate();
	}
	/**
	 * �Զ����㣬���ݵ�ǰҳ��ҳ��С��������������������Ե�ֵ
	 */
	private void autoCalculate() {
		start = (currentPageNumber - 1) * pageSize;
		end = start + pageSize;
		if (end > total) {
			end = total;
		}
		viewStart = start + 1;
		viewEnd = end + 1;
		totalPage = (total + pageSize - 1) / pageSize;
		if (currentPageNumber == 1) {
			hasPrevious = false;
			previousPageNumber = 1;
		} else {
			hasPrevious = true;
			previousPageNumber = currentPageNumber - 1;
		}
		if (currentPageNumber == totalPage) {
			hasNext = false;
			nextPageNumber = totalPage;
		} else {
			hasNext = true;
			nextPageNumber = currentPageNumber + 1;
		}
	}
	/**
	 * �����ʾ��ҳ��Ŀ�ʼ��¼�ţ���1��ʼ
	 * 
	 * @return: int ��ʾ��ҳ��Ŀ�ʼ��¼��
	 */
	public int getStart() {
		return start;
	}
	/**
	 * �����ʾ��ҳ��Ľ�����¼��
	 * 
	 * @return: int ��ʾ��ҳ��Ľ�����¼��
	 */
	public int getEnd() {
		return end;
	}
	/**
	 * �����ʾ��ҳ��Ŀ�ʼ��¼�ţ���1��ʼ
	 * 
	 * @return: int ��ʾ��ҳ��Ŀ�ʼ��¼��
	 */
	public int getViewStart() {
		return viewStart;
	}
	/**
	 * �����ʾ��ҳ��Ľ�����¼��
	 * 
	 * @return: int ��ʾ��ҳ��Ľ�����¼��
	 */
	public int getViewEnd() {
		return viewEnd;
	}
	/**
	 * �Ƿ�����һҳ
	 * 
	 * @return: boolean �Ƿ�����һҳ�Ŀ���
	 */
	public boolean hasNextPage() {
		return hasNext;
	}
	/**
	 * �Ƿ�����һҳ
	 * 
	 * @return: boolean �Ƿ�����һҳ�Ŀ���
	 */
	public boolean hasPreviousPage() {
		return start > 0;
	}
	/**
	 * �����һҳ��ҳ��
	 * 
	 * @return: int ��һҳ��ҳ��
	 */
	public int getPreviousPageNumber() {
		return previousPageNumber;
	}
	/**
	 * �����һҳ��ҳ��
	 * 
	 * @return: int ��һҳ��ҳ��
	 */
	public int getNextPageNumber() {
		return nextPageNumber;
	}
	/**
	 * ��ý�����м�¼������
	 * 
	 * @return: int һ���ж����м�¼
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * �����ҳ��
	 * 
	 * @return: int һ���ж���ҳ
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * ��õ�ǰҳ��
	 * 
	 * @return: int ��ǰҳ��
	 */
	public int getCurrentPageNumber() {
		return currentPageNumber;
	}
	/**
	 * ���ÿҳ�����м�¼
	 * 
	 * @return: int ҳ��С
	 */
	public int getPageSize() {
		return pageSize;
	}
}
