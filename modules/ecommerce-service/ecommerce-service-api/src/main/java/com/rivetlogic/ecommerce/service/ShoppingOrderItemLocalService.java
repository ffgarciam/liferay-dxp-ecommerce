/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.ecommerce.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rivetlogic.ecommerce.model.ShoppingOrder;
import com.rivetlogic.ecommerce.model.ShoppingOrderItem;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Provides the local service interface for ShoppingOrderItem. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author rivetlogic
 * @see ShoppingOrderItemLocalServiceUtil
 * @see com.rivetlogic.ecommerce.service.base.ShoppingOrderItemLocalServiceBaseImpl
 * @see com.rivetlogic.ecommerce.service.impl.ShoppingOrderItemLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ShoppingOrderItemLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShoppingOrderItemLocalServiceUtil} to access the Shopping Order Item local service. Add custom service methods to {@link com.rivetlogic.ecommerce.service.impl.ShoppingOrderItemLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the Shopping Order Item to the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingOrderItem the Shopping Order Item
	* @return the Shopping Order Item that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ShoppingOrderItem addShoppingOrderItem(
		ShoppingOrderItem shoppingOrderItem);

	public ShoppingOrderItem createOrderItem(long orderId);

	/**
	* Creates a new Shopping Order Item with the primary key. Does not add the Shopping Order Item to the database.
	*
	* @param itemId the primary key for the new Shopping Order Item
	* @return the new Shopping Order Item
	*/
	public ShoppingOrderItem createShoppingOrderItem(long itemId);

	/**
	* Deletes the Shopping Order Item from the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingOrderItem the Shopping Order Item
	* @return the Shopping Order Item that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ShoppingOrderItem deleteShoppingOrderItem(
		ShoppingOrderItem shoppingOrderItem);

	/**
	* Deletes the Shopping Order Item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the Shopping Order Item
	* @return the Shopping Order Item that was removed
	* @throws PortalException if a Shopping Order Item with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ShoppingOrderItem deleteShoppingOrderItem(long itemId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ShoppingOrderItem fetchShoppingOrderItem(long itemId);

	/**
	* Returns the Shopping Order Item matching the UUID and group.
	*
	* @param uuid the Shopping Order Item's UUID
	* @param groupId the primary key of the group
	* @return the matching Shopping Order Item, or <code>null</code> if a matching Shopping Order Item could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ShoppingOrderItem fetchShoppingOrderItemByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	public ShoppingOrderItem findByOrderAndProductId(long orderId,
		java.lang.String productId) throws SystemException;

	/**
	* Returns the Shopping Order Item with the primary key.
	*
	* @param itemId the primary key of the Shopping Order Item
	* @return the Shopping Order Item
	* @throws PortalException if a Shopping Order Item with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ShoppingOrderItem getShoppingOrderItem(long itemId)
		throws PortalException;

	/**
	* Returns the Shopping Order Item matching the UUID and group.
	*
	* @param uuid the Shopping Order Item's UUID
	* @param groupId the primary key of the group
	* @return the matching Shopping Order Item
	* @throws PortalException if a matching Shopping Order Item could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ShoppingOrderItem getShoppingOrderItemByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	public ShoppingOrderItem updateOrderItem(
		ShoppingOrderItem shoppingOrderItem, ServiceContext serviceContext)
		throws SystemException;

	/**
	* Updates the Shopping Order Item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shoppingOrderItem the Shopping Order Item
	* @return the Shopping Order Item that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ShoppingOrderItem updateShoppingOrderItem(
		ShoppingOrderItem shoppingOrderItem);

	/**
	* Returns the number of Shopping Order Items.
	*
	* @return the number of Shopping Order Items
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getShoppingOrderItemsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	public List<ShoppingOrderItem> findByOrderId(long orderId)
		throws SystemException;

	/**
	* Returns a range of all the Shopping Order Items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Shopping Order Items
	* @param end the upper bound of the range of Shopping Order Items (not inclusive)
	* @return the range of Shopping Order Items
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ShoppingOrderItem> getShoppingOrderItems(int start, int end);

	/**
	* Returns all the Shopping Order Items matching the UUID and company.
	*
	* @param uuid the UUID of the Shopping Order Items
	* @param companyId the primary key of the company
	* @return the matching Shopping Order Items, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ShoppingOrderItem> getShoppingOrderItemsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of Shopping Order Items matching the UUID and company.
	*
	* @param uuid the UUID of the Shopping Order Items
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of Shopping Order Items
	* @param end the upper bound of the range of Shopping Order Items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching Shopping Order Items, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ShoppingOrderItem> getShoppingOrderItemsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<ShoppingOrderItem> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public void saveOrderItemByProductId(java.lang.String productId,
		ShoppingOrder shoppingOrder, float price, ServiceContext serviceContext)
		throws SystemException;

	public void saveOrderItemsByProductId(
		List<java.lang.String> productIdsList, ShoppingOrder shoppingOrder,
		ServiceContext serviceContext) throws SystemException;

	public void saveOrderItemsByProductId(
		List<java.lang.String> productIdsList, ShoppingOrder shoppingOrder,
		Map<java.lang.String, java.lang.Float> prices,
		ServiceContext serviceContext) throws SystemException;
}