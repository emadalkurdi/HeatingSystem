// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the MxModelReflection module
	public static void aCT_ShowMemberPage(IContext context, mxmodelreflection.proxies.MxObjectMember _mxObjectMember)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectMember", _mxObjectMember == null ? null : _mxObjectMember.getMendixObject());
		Core.microflowCall("MxModelReflection.ACT_ShowMemberPage").withParams(params).execute(context);
	}
	public static boolean aSu_CheckMetamodel(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MxModelReflection.ASu_CheckMetamodel").withParams(params).execute(context);
	}
	public static boolean bCo_MxObjectMember_CreateCompleteMemberName(IContext context, mxmodelreflection.proxies.MxObjectMember _mxObjectMember)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectMember", _mxObjectMember == null ? null : _mxObjectMember.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MxModelReflection.BCo_MxObjectMember_CreateCompleteMemberName").withParams(params).execute(context);
	}
	public static boolean bCo_MxObjectReference(IContext context, mxmodelreflection.proxies.MxObjectReference _mxObjectReference)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectReference", _mxObjectReference == null ? null : _mxObjectReference.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MxModelReflection.BCo_MxObjectReference").withParams(params).execute(context);
	}
	public static boolean bCo_MxObjectType(IContext context, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MxModelReflection.BCo_MxObjectType").withParams(params).execute(context);
	}
	public static boolean bCo_Token(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MxModelReflection.BCo_Token").withParams(params).execute(context);
	}
	public static boolean bDe_MxObjectType(IContext context, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MxModelReflection.BDe_MxObjectType").withParams(params).execute(context);
	}
	public static void ch_Member(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MxModelReflection.Ch_Member").withParams(params).execute(context);
	}
	public static void ch_ObjecttypeReference(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MxModelReflection.Ch_ObjecttypeReference").withParams(params).execute(context);
	}
	public static void ch_ObjectTypeStart(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MxModelReflection.Ch_ObjectTypeStart").withParams(params).execute(context);
	}
	public static void ch_Reference(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MxModelReflection.Ch_Reference").withParams(params).execute(context);
	}
	public static void deleteDbSizeEstimate(IContext context, mxmodelreflection.proxies.DbSizeEstimate _dbSizeEstimate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DbSizeEstimate", _dbSizeEstimate == null ? null : _dbSizeEstimate.getMendixObject());
		Core.microflowCall("MxModelReflection.DeleteDbSizeEstimate").withParams(params).execute(context);
	}
	public static void deleteToken(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MxModelReflection.DeleteToken").withParams(params).execute(context);
	}
	public static java.util.List<mxmodelreflection.proxies.Module> dSL_Modules(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MxModelReflection.DSL_Modules").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> mxmodelreflection.proxies.Module.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static mxmodelreflection.proxies.InheritsFromContainer dSO_InheritsFromContainer(IContext context, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.DSO_InheritsFromContainer").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.InheritsFromContainer.initialize(context, result);
	}
	public static mxmodelreflection.proxies.StringValue enumValueCaptions(IContext context, mxmodelreflection.proxies.MxObjectEnumValue _mxObjectEnumValue)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectEnumValue", _mxObjectEnumValue == null ? null : _mxObjectEnumValue.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.EnumValueCaptions").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.StringValue.initialize(context, result);
	}
	public static mxmodelreflection.proxies.StringValue enumValueLanguages(IContext context, mxmodelreflection.proxies.MxObjectEnumValue _mxObjectEnumValue)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectEnumValue", _mxObjectEnumValue == null ? null : _mxObjectEnumValue.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.EnumValueLanguages").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.StringValue.initialize(context, result);
	}
	public static mxmodelreflection.proxies.MxObjectMember findMember(IContext context, java.lang.String _memberSearchString, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MemberSearchString", _memberSearchString);
		params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.FindMember").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.MxObjectMember.initialize(context, result);
	}
	public static mxmodelreflection.proxies.Microflows findMicroflow(IContext context, java.lang.String _microflowSearchString)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MicroflowSearchString", _microflowSearchString);
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.FindMicroflow").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.Microflows.initialize(context, result);
	}
	public static mxmodelreflection.proxies.MxObjectType findObjectType(IContext context, java.lang.String _objectTypeSearchString, mxmodelreflection.proxies.MxObjectReference _mxObjectReference_optional)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ObjectTypeSearchString", _objectTypeSearchString);
		params.put("MxObjectReference_optional", _mxObjectReference_optional == null ? null : _mxObjectReference_optional.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.FindObjectType").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.MxObjectType.initialize(context, result);
	}
	public static mxmodelreflection.proxies.MxObjectReference findReference(IContext context, java.lang.String _referenceSearchString, mxmodelreflection.proxies.MxObjectType _mxObjectType_optional)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ReferenceSearchString", _referenceSearchString);
		params.put("MxObjectType_optional", _mxObjectType_optional == null ? null : _mxObjectType_optional.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.FindReference").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.MxObjectReference.initialize(context, result);
	}
	public static void iVK_MxObjectTypeCommit(IContext context, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
		Core.microflowCall("MxModelReflection.IVK_MxObjectTypeCommit").withParams(params).execute(context);
	}
	public static void iVK_OpenReferencedMendixObject(IContext context, mxmodelreflection.proxies.MxObjectReference _selection, mxmodelreflection.proxies.MxObjectType _mxObjectType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Selection", _selection == null ? null : _selection.getMendixObject());
		params.put("MxObjectType", _mxObjectType == null ? null : _mxObjectType.getMendixObject());
		Core.microflowCall("MxModelReflection.IVK_OpenReferencedMendixObject").withParams(params).execute(context);
	}
	public static void iVK_RecalculateSize(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MxModelReflection.IVK_RecalculateSize").withParams(params).execute(context);
	}
	public static void iVK_SyncObjects(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MxModelReflection.IVK_SyncObjects").withParams(params).execute(context);
	}
	public static void iVK_ToggleModule(IContext context, mxmodelreflection.proxies.Module _module)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Module", _module == null ? null : _module.getMendixObject());
		Core.microflowCall("MxModelReflection.IVK_ToggleModule").withParams(params).execute(context);
	}
	public static java.lang.Long log(IContext context, java.lang.Long _base, java.lang.Long _x)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Base", _base);
		params.put("x", _x);
		return (java.lang.Long) Core.microflowCall("MxModelReflection.Log").withParams(params).execute(context);
	}
	public static void mB_TestThePattern(IContext context, mxmodelreflection.proxies.TestPattern _testPattern)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestPattern", _testPattern == null ? null : _testPattern.getMendixObject());
		Core.microflowCall("MxModelReflection.MB_TestThePattern").withParams(params).execute(context);
	}
	public static void mB_TestTokenPattern(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MxModelReflection.MB_TestTokenPattern").withParams(params).execute(context);
	}
	public static void oC_FindObjectType(IContext context, mxmodelreflection.proxies.DbSizeEstimate _dbSizeEstimate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DbSizeEstimate", _dbSizeEstimate == null ? null : _dbSizeEstimate.getMendixObject());
		Core.microflowCall("MxModelReflection.OC_FindObjectType").withParams(params).execute(context);
	}
	public static mxmodelreflection.proxies.StringValue referenceObjects(IContext context, mxmodelreflection.proxies.MxObjectReference _mxObjectReference)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MxObjectReference", _mxObjectReference == null ? null : _mxObjectReference.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MxModelReflection.ReferenceObjects").withParams(params).execute(context);
		return result == null ? null : mxmodelreflection.proxies.StringValue.initialize(context, result);
	}
}
