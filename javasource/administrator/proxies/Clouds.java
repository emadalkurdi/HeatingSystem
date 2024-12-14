// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administrator.proxies;

public class Clouds
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject cloudsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administrator.Clouds";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		All("All"),
		Clouds_Root("Administrator.Clouds_Root");

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

	public Clouds(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Clouds(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cloudsMendixObject)
	{
		if (cloudsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, cloudsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.cloudsMendixObject = cloudsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Clouds.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static administrator.proxies.Clouds initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administrator.proxies.Clouds.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static administrator.proxies.Clouds initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administrator.proxies.Clouds(context, mendixObject);
	}

	public static administrator.proxies.Clouds load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administrator.proxies.Clouds.initialize(context, mendixObject);
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
	 * @return value of All
	 */
	public final java.lang.Integer getAll()
	{
		return getAll(getContext());
	}

	/**
	 * @param context
	 * @return value of All
	 */
	public final java.lang.Integer getAll(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.All.toString());
	}

	/**
	 * Set value of All
	 * @param all
	 */
	public final void setAll(java.lang.Integer all)
	{
		setAll(getContext(), all);
	}

	/**
	 * Set value of All
	 * @param context
	 * @param all
	 */
	public final void setAll(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer all)
	{
		getMendixObject().setValue(context, MemberNames.All.toString(), all);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Clouds_Root
	 */
	public final administrator.proxies.Root getClouds_Root() throws com.mendix.core.CoreException
	{
		return getClouds_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Clouds_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Root getClouds_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Clouds_Root.toString());
		if (identifier != null) {
			result = administrator.proxies.Root.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Clouds_Root
	 * @param clouds_root
	 */
	public final void setClouds_Root(administrator.proxies.Root clouds_root)
	{
		setClouds_Root(getContext(), clouds_root);
	}

	/**
	 * Set value of Clouds_Root
	 * @param context
	 * @param clouds_root
	 */
	public final void setClouds_Root(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Root clouds_root)
	{
		if (clouds_root == null) {
			getMendixObject().setValue(context, MemberNames.Clouds_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Clouds_Root.toString(), clouds_root.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return cloudsMendixObject;
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
			final administrator.proxies.Clouds that = (administrator.proxies.Clouds) obj;
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
