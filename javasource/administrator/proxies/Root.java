// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administrator.proxies;

public class Root
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administrator.Root";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Base("Base"),
		Visibility("Visibility"),
		Dt("Dt"),
		Timezone("Timezone"),
		_id("_id"),
		Name("Name"),
		Cod("Cod"),
		Coord_Root("Administrator.Coord_Root"),
		Weather_Root("Administrator.Weather_Root"),
		Main_Root("Administrator.Main_Root"),
		Wind_Root("Administrator.Wind_Root"),
		Clouds_Root("Administrator.Clouds_Root"),
		Sys_Root("Administrator.Sys_Root");

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

	public Root(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Root(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject)
	{
		if (rootMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, rootMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.rootMendixObject = rootMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Root.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static administrator.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administrator.proxies.Root.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static administrator.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administrator.proxies.Root(context, mendixObject);
	}

	public static administrator.proxies.Root load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administrator.proxies.Root.initialize(context, mendixObject);
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
	 * @return value of Base
	 */
	public final java.lang.String getBase()
	{
		return getBase(getContext());
	}

	/**
	 * @param context
	 * @return value of Base
	 */
	public final java.lang.String getBase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Base.toString());
	}

	/**
	 * Set value of Base
	 * @param base
	 */
	public final void setBase(java.lang.String base)
	{
		setBase(getContext(), base);
	}

	/**
	 * Set value of Base
	 * @param context
	 * @param base
	 */
	public final void setBase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String base)
	{
		getMendixObject().setValue(context, MemberNames.Base.toString(), base);
	}

	/**
	 * @return value of Visibility
	 */
	public final java.lang.Integer getVisibility()
	{
		return getVisibility(getContext());
	}

	/**
	 * @param context
	 * @return value of Visibility
	 */
	public final java.lang.Integer getVisibility(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Visibility.toString());
	}

	/**
	 * Set value of Visibility
	 * @param visibility
	 */
	public final void setVisibility(java.lang.Integer visibility)
	{
		setVisibility(getContext(), visibility);
	}

	/**
	 * Set value of Visibility
	 * @param context
	 * @param visibility
	 */
	public final void setVisibility(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer visibility)
	{
		getMendixObject().setValue(context, MemberNames.Visibility.toString(), visibility);
	}

	/**
	 * @return value of Dt
	 */
	public final java.lang.Integer getDt()
	{
		return getDt(getContext());
	}

	/**
	 * @param context
	 * @return value of Dt
	 */
	public final java.lang.Integer getDt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Dt.toString());
	}

	/**
	 * Set value of Dt
	 * @param dt
	 */
	public final void setDt(java.lang.Integer dt)
	{
		setDt(getContext(), dt);
	}

	/**
	 * Set value of Dt
	 * @param context
	 * @param dt
	 */
	public final void setDt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer dt)
	{
		getMendixObject().setValue(context, MemberNames.Dt.toString(), dt);
	}

	/**
	 * @return value of Timezone
	 */
	public final java.lang.Integer getTimezone()
	{
		return getTimezone(getContext());
	}

	/**
	 * @param context
	 * @return value of Timezone
	 */
	public final java.lang.Integer getTimezone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Timezone.toString());
	}

	/**
	 * Set value of Timezone
	 * @param timezone
	 */
	public final void setTimezone(java.lang.Integer timezone)
	{
		setTimezone(getContext(), timezone);
	}

	/**
	 * Set value of Timezone
	 * @param context
	 * @param timezone
	 */
	public final void setTimezone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer timezone)
	{
		getMendixObject().setValue(context, MemberNames.Timezone.toString(), timezone);
	}

	/**
	 * @return value of _id
	 */
	public final java.lang.Integer get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.Integer get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.Integer _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Cod
	 */
	public final java.lang.Integer getCod()
	{
		return getCod(getContext());
	}

	/**
	 * @param context
	 * @return value of Cod
	 */
	public final java.lang.Integer getCod(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Cod.toString());
	}

	/**
	 * Set value of Cod
	 * @param cod
	 */
	public final void setCod(java.lang.Integer cod)
	{
		setCod(getContext(), cod);
	}

	/**
	 * Set value of Cod
	 * @param context
	 * @param cod
	 */
	public final void setCod(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer cod)
	{
		getMendixObject().setValue(context, MemberNames.Cod.toString(), cod);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Coord_Root
	 */
	public final administrator.proxies.Coord getCoord_Root() throws com.mendix.core.CoreException
	{
		return getCoord_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Coord_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Coord getCoord_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Coord result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Coord_Root.toString());
		if (identifier != null) {
			result = administrator.proxies.Coord.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Coord_Root
	 * @param coord_root
	 */
	public final void setCoord_Root(administrator.proxies.Coord coord_root)
	{
		setCoord_Root(getContext(), coord_root);
	}

	/**
	 * Set value of Coord_Root
	 * @param context
	 * @param coord_root
	 */
	public final void setCoord_Root(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Coord coord_root)
	{
		if (coord_root == null) {
			getMendixObject().setValue(context, MemberNames.Coord_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Coord_Root.toString(), coord_root.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Weather_Root
	 */
	public final administrator.proxies.Weather getWeather_Root() throws com.mendix.core.CoreException
	{
		return getWeather_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Weather_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Weather getWeather_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Weather result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Weather_Root.toString());
		if (identifier != null) {
			result = administrator.proxies.Weather.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Weather_Root
	 * @param weather_root
	 */
	public final void setWeather_Root(administrator.proxies.Weather weather_root)
	{
		setWeather_Root(getContext(), weather_root);
	}

	/**
	 * Set value of Weather_Root
	 * @param context
	 * @param weather_root
	 */
	public final void setWeather_Root(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Weather weather_root)
	{
		if (weather_root == null) {
			getMendixObject().setValue(context, MemberNames.Weather_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Weather_Root.toString(), weather_root.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Main_Root
	 */
	public final administrator.proxies.Main getMain_Root() throws com.mendix.core.CoreException
	{
		return getMain_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Main_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Main getMain_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Main result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Main_Root.toString());
		if (identifier != null) {
			result = administrator.proxies.Main.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Main_Root
	 * @param main_root
	 */
	public final void setMain_Root(administrator.proxies.Main main_root)
	{
		setMain_Root(getContext(), main_root);
	}

	/**
	 * Set value of Main_Root
	 * @param context
	 * @param main_root
	 */
	public final void setMain_Root(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Main main_root)
	{
		if (main_root == null) {
			getMendixObject().setValue(context, MemberNames.Main_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Main_Root.toString(), main_root.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Wind_Root
	 */
	public final administrator.proxies.Wind getWind_Root() throws com.mendix.core.CoreException
	{
		return getWind_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Wind_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Wind getWind_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Wind result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Wind_Root.toString());
		if (identifier != null) {
			result = administrator.proxies.Wind.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Wind_Root
	 * @param wind_root
	 */
	public final void setWind_Root(administrator.proxies.Wind wind_root)
	{
		setWind_Root(getContext(), wind_root);
	}

	/**
	 * Set value of Wind_Root
	 * @param context
	 * @param wind_root
	 */
	public final void setWind_Root(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Wind wind_root)
	{
		if (wind_root == null) {
			getMendixObject().setValue(context, MemberNames.Wind_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Wind_Root.toString(), wind_root.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Clouds_Root
	 */
	public final administrator.proxies.Clouds getClouds_Root() throws com.mendix.core.CoreException
	{
		return getClouds_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Clouds_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Clouds getClouds_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Clouds result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Clouds_Root.toString());
		if (identifier != null) {
			result = administrator.proxies.Clouds.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Clouds_Root
	 * @param clouds_root
	 */
	public final void setClouds_Root(administrator.proxies.Clouds clouds_root)
	{
		setClouds_Root(getContext(), clouds_root);
	}

	/**
	 * Set value of Clouds_Root
	 * @param context
	 * @param clouds_root
	 */
	public final void setClouds_Root(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Clouds clouds_root)
	{
		if (clouds_root == null) {
			getMendixObject().setValue(context, MemberNames.Clouds_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Clouds_Root.toString(), clouds_root.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Sys_Root
	 */
	public final administrator.proxies.Sys getSys_Root() throws com.mendix.core.CoreException
	{
		return getSys_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Sys_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Sys getSys_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Sys result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Sys_Root.toString());
		if (identifier != null) {
			result = administrator.proxies.Sys.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Sys_Root
	 * @param sys_root
	 */
	public final void setSys_Root(administrator.proxies.Sys sys_root)
	{
		setSys_Root(getContext(), sys_root);
	}

	/**
	 * Set value of Sys_Root
	 * @param context
	 * @param sys_root
	 */
	public final void setSys_Root(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Sys sys_root)
	{
		if (sys_root == null) {
			getMendixObject().setValue(context, MemberNames.Sys_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Sys_Root.toString(), sys_root.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rootMendixObject;
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
			final administrator.proxies.Root that = (administrator.proxies.Root) obj;
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
