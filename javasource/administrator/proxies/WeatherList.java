// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administrator.proxies;

public class WeatherList
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject weatherListMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administrator.WeatherList";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_id("_id"),
		Main("Main"),
		Description("Description"),
		Icon("Icon"),
		WeatherList_Weather("Administrator.WeatherList_Weather");

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

	public WeatherList(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WeatherList(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject weatherListMendixObject)
	{
		if (weatherListMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, weatherListMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.weatherListMendixObject = weatherListMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WeatherList.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static administrator.proxies.WeatherList initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administrator.proxies.WeatherList.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static administrator.proxies.WeatherList initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administrator.proxies.WeatherList(context, mendixObject);
	}

	public static administrator.proxies.WeatherList load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administrator.proxies.WeatherList.initialize(context, mendixObject);
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
	 * @return value of Main
	 */
	public final java.lang.String getMain()
	{
		return getMain(getContext());
	}

	/**
	 * @param context
	 * @return value of Main
	 */
	public final java.lang.String getMain(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Main.toString());
	}

	/**
	 * Set value of Main
	 * @param main
	 */
	public final void setMain(java.lang.String main)
	{
		setMain(getContext(), main);
	}

	/**
	 * Set value of Main
	 * @param context
	 * @param main
	 */
	public final void setMain(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String main)
	{
		getMendixObject().setValue(context, MemberNames.Main.toString(), main);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Icon
	 */
	public final java.lang.String getIcon()
	{
		return getIcon(getContext());
	}

	/**
	 * @param context
	 * @return value of Icon
	 */
	public final java.lang.String getIcon(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Icon.toString());
	}

	/**
	 * Set value of Icon
	 * @param icon
	 */
	public final void setIcon(java.lang.String icon)
	{
		setIcon(getContext(), icon);
	}

	/**
	 * Set value of Icon
	 * @param context
	 * @param icon
	 */
	public final void setIcon(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String icon)
	{
		getMendixObject().setValue(context, MemberNames.Icon.toString(), icon);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WeatherList_Weather
	 */
	public final administrator.proxies.Weather getWeatherList_Weather() throws com.mendix.core.CoreException
	{
		return getWeatherList_Weather(getContext());
	}

	/**
	 * @param context
	 * @return value of WeatherList_Weather
	 * @throws com.mendix.core.CoreException
	 */
	public final administrator.proxies.Weather getWeatherList_Weather(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administrator.proxies.Weather result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WeatherList_Weather.toString());
		if (identifier != null) {
			result = administrator.proxies.Weather.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WeatherList_Weather
	 * @param weatherlist_weather
	 */
	public final void setWeatherList_Weather(administrator.proxies.Weather weatherlist_weather)
	{
		setWeatherList_Weather(getContext(), weatherlist_weather);
	}

	/**
	 * Set value of WeatherList_Weather
	 * @param context
	 * @param weatherlist_weather
	 */
	public final void setWeatherList_Weather(com.mendix.systemwideinterfaces.core.IContext context, administrator.proxies.Weather weatherlist_weather)
	{
		if (weatherlist_weather == null) {
			getMendixObject().setValue(context, MemberNames.WeatherList_Weather.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WeatherList_Weather.toString(), weatherlist_weather.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return weatherListMendixObject;
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
			final administrator.proxies.WeatherList that = (administrator.proxies.WeatherList) obj;
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