// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package backenduser.proxies;

public class WorkOrder
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workOrderMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BackendUser.WorkOrder";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		WorkOrderNo("WorkOrderNo"),
		LineItems("LineItems"),
		ServiceCost("ServiceCost"),
		WorkOrder_ServiceRequest("BackendUser.WorkOrder_ServiceRequest");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public WorkOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WorkOrder(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workOrderMendixObject)
	{
		if (workOrderMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, workOrderMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.workOrderMendixObject = workOrderMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkOrder.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static backenduser.proxies.WorkOrder initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return backenduser.proxies.WorkOrder.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static backenduser.proxies.WorkOrder initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new backenduser.proxies.WorkOrder(context, mendixObject);
	}

	public static backenduser.proxies.WorkOrder load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return backenduser.proxies.WorkOrder.initialize(context, mendixObject);
	}

	public static java.util.List<backenduser.proxies.WorkOrder> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> backenduser.proxies.WorkOrder.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of WorkOrderNo
	 */
	public final java.lang.Long getWorkOrderNo()
	{
		return getWorkOrderNo(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkOrderNo
	 */
	public final java.lang.Long getWorkOrderNo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.WorkOrderNo.toString());
	}

	/**
	 * Set value of WorkOrderNo
	 * @param workorderno
	 */
	public final void setWorkOrderNo(java.lang.Long workorderno)
	{
		setWorkOrderNo(getContext(), workorderno);
	}

	/**
	 * Set value of WorkOrderNo
	 * @param context
	 * @param workorderno
	 */
	public final void setWorkOrderNo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long workorderno)
	{
		getMendixObject().setValue(context, MemberNames.WorkOrderNo.toString(), workorderno);
	}

	/**
	 * @return value of LineItems
	 */
	public final java.lang.String getLineItems()
	{
		return getLineItems(getContext());
	}

	/**
	 * @param context
	 * @return value of LineItems
	 */
	public final java.lang.String getLineItems(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LineItems.toString());
	}

	/**
	 * Set value of LineItems
	 * @param lineitems
	 */
	public final void setLineItems(java.lang.String lineitems)
	{
		setLineItems(getContext(), lineitems);
	}

	/**
	 * Set value of LineItems
	 * @param context
	 * @param lineitems
	 */
	public final void setLineItems(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lineitems)
	{
		getMendixObject().setValue(context, MemberNames.LineItems.toString(), lineitems);
	}

	/**
	 * @return value of ServiceCost
	 */
	public final java.math.BigDecimal getServiceCost()
	{
		return getServiceCost(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceCost
	 */
	public final java.math.BigDecimal getServiceCost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.ServiceCost.toString());
	}

	/**
	 * Set value of ServiceCost
	 * @param servicecost
	 */
	public final void setServiceCost(java.math.BigDecimal servicecost)
	{
		setServiceCost(getContext(), servicecost);
	}

	/**
	 * Set value of ServiceCost
	 * @param context
	 * @param servicecost
	 */
	public final void setServiceCost(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal servicecost)
	{
		getMendixObject().setValue(context, MemberNames.ServiceCost.toString(), servicecost);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkOrder_ServiceRequest
	 */
	public final customer.proxies.ServiceRequest getWorkOrder_ServiceRequest() throws com.mendix.core.CoreException
	{
		return getWorkOrder_ServiceRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkOrder_ServiceRequest
	 * @throws com.mendix.core.CoreException
	 */
	public final customer.proxies.ServiceRequest getWorkOrder_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		customer.proxies.ServiceRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkOrder_ServiceRequest.toString());
		if (identifier != null) {
			result = customer.proxies.ServiceRequest.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkOrder_ServiceRequest
	 * @param workorder_servicerequest
	 */
	public final void setWorkOrder_ServiceRequest(customer.proxies.ServiceRequest workorder_servicerequest)
	{
		setWorkOrder_ServiceRequest(getContext(), workorder_servicerequest);
	}

	/**
	 * Set value of WorkOrder_ServiceRequest
	 * @param context
	 * @param workorder_servicerequest
	 */
	public final void setWorkOrder_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context, customer.proxies.ServiceRequest workorder_servicerequest)
	{
		if (workorder_servicerequest == null) {
			getMendixObject().setValue(context, MemberNames.WorkOrder_ServiceRequest.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkOrder_ServiceRequest.toString(), workorder_servicerequest.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workOrderMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final backenduser.proxies.WorkOrder that = (backenduser.proxies.WorkOrder) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
