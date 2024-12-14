// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package backenduser.proxies;

public class Document extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BackendUser.Document";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Document_ServiceRequest("BackendUser.Document_ServiceRequest");

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

	public Document(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Document(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject documentMendixObject)
	{
		super(context, documentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, documentMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Document.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static backenduser.proxies.Document initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return backenduser.proxies.Document.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static backenduser.proxies.Document initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new backenduser.proxies.Document(context, mendixObject);
	}

	public static backenduser.proxies.Document load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return backenduser.proxies.Document.initialize(context, mendixObject);
	}

	public static java.util.List<backenduser.proxies.Document> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> backenduser.proxies.Document.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Document_ServiceRequest
	 */
	public final customer.proxies.ServiceRequest getDocument_ServiceRequest() throws com.mendix.core.CoreException
	{
		return getDocument_ServiceRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of Document_ServiceRequest
	 * @throws com.mendix.core.CoreException
	 */
	public final customer.proxies.ServiceRequest getDocument_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		customer.proxies.ServiceRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Document_ServiceRequest.toString());
		if (identifier != null) {
			result = customer.proxies.ServiceRequest.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Document_ServiceRequest
	 * @param document_servicerequest
	 */
	public final void setDocument_ServiceRequest(customer.proxies.ServiceRequest document_servicerequest)
	{
		setDocument_ServiceRequest(getContext(), document_servicerequest);
	}

	/**
	 * Set value of Document_ServiceRequest
	 * @param context
	 * @param document_servicerequest
	 */
	public final void setDocument_ServiceRequest(com.mendix.systemwideinterfaces.core.IContext context, customer.proxies.ServiceRequest document_servicerequest)
	{
		if (document_servicerequest == null) {
			getMendixObject().setValue(context, MemberNames.Document_ServiceRequest.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Document_ServiceRequest.toString(), document_servicerequest.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final backenduser.proxies.Document that = (backenduser.proxies.Document) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
