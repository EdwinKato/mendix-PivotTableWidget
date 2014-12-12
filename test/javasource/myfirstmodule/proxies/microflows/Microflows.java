// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the Microflows for the MyFirstModule module

	public static void carrier_Generate(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.Carrier_Generate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void category_Generate(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.Category_Generate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void closeIncidentPivotTable(IContext context, myfirstmodule.proxies.TransientIncidentPivotTableParameters _transientIncidentPivotTableParameters)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("transientIncidentPivotTableParameters", _transientIncidentPivotTableParameters == null ? null : _transientIncidentPivotTableParameters.getMendixObject());
			Core.execute(context, "MyFirstModule.CloseIncidentPivotTable", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void closeSalesOrderPivotTable(IContext context, myfirstmodule.proxies.TransientSalesOrderPivotTableParameters _transientSalesOrderPivotTableParameters)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("transientSalesOrderPivotTableParameters", _transientSalesOrderPivotTableParameters == null ? null : _transientSalesOrderPivotTableParameters.getMendixObject());
			Core.execute(context, "MyFirstModule.CloseSalesOrderPivotTable", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void exportCsvData(IContext context, myfirstmodule.proxies.ExportCsv _exportCsv)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ExportCsv", _exportCsv == null ? null : _exportCsv.getMendixObject());
			Core.execute(context, "MyFirstModule.ExportCsvData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static usermanagement.proxies.Account getCurrentAccount(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.GetCurrentAccount", params);
			return result == null ? null : usermanagement.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void incident_Generate(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.Incident_Generate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void incidentPivotTable_OnCellClick(IContext context, myfirstmodule.proxies.TransientIncidentPivotTableCell _transientIncidentPivotTableCell)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("transientIncidentPivotTableCell", _transientIncidentPivotTableCell == null ? null : _transientIncidentPivotTableCell.getMendixObject());
			Core.execute(context, "MyFirstModule.IncidentPivotTable_OnCellClick", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void nAV_StartRotatedColumnheaderTool(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.NAV_StartRotatedColumnheaderTool", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void salesOrder_Generate(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.SalesOrder_Generate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void showCountPivotTableDefault(IContext context, myfirstmodule.proxies.TransientIncidentPivotTableParameters _transientIncidentPivotTableParameters)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("transientIncidentPivotTableParameters", _transientIncidentPivotTableParameters == null ? null : _transientIncidentPivotTableParameters.getMendixObject());
			Core.execute(context, "MyFirstModule.ShowCountPivotTableDefault", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void showCountPivotTableTresholds(IContext context, myfirstmodule.proxies.TransientIncidentPivotTableParameters _transientIncidentPivotTableParameters)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("transientIncidentPivotTableParameters", _transientIncidentPivotTableParameters == null ? null : _transientIncidentPivotTableParameters.getMendixObject());
			Core.execute(context, "MyFirstModule.ShowCountPivotTableTresholds", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static java.util.List<myfirstmodule.proxies.TransientIncidentPivotTable> transientIncidentPivotTable_CreateEmptyList(IContext context, myfirstmodule.proxies.TransientIncidentPivotTableParameters _transientIncidentPivotTableParameters)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("TransientIncidentPivotTableParameters", _transientIncidentPivotTableParameters == null ? null : _transientIncidentPivotTableParameters.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "MyFirstModule.TransientIncidentPivotTable_CreateEmptyList", params);
			java.util.List<myfirstmodule.proxies.TransientIncidentPivotTable> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<myfirstmodule.proxies.TransientIncidentPivotTable>();
				for (IMendixObject obj : objs)
					result.add(myfirstmodule.proxies.TransientIncidentPivotTable.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static java.util.List<myfirstmodule.proxies.TransientIncidentPivotTable> transientIncidentPivotTable_CreateList(IContext context, myfirstmodule.proxies.TransientIncidentPivotTableParameters _transientIncidentPivotTableParameters)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("transientIncidentPivotTableParameters", _transientIncidentPivotTableParameters == null ? null : _transientIncidentPivotTableParameters.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "MyFirstModule.TransientIncidentPivotTable_CreateList", params);
			java.util.List<myfirstmodule.proxies.TransientIncidentPivotTable> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<myfirstmodule.proxies.TransientIncidentPivotTable>();
				for (IMendixObject obj : objs)
					result.add(myfirstmodule.proxies.TransientIncidentPivotTable.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static myfirstmodule.proxies.TransientIncidentPivotTableParameters transientIncidentPivotTableParameters_CreateObject(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.TransientIncidentPivotTableParameters_CreateObject", params);
			return result == null ? null : myfirstmodule.proxies.TransientIncidentPivotTableParameters.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void transientRotatedColumnHeaderData_CreateCss(IContext context, myfirstmodule.proxies.TransientRotatedColumnHeaderData _data)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("data", _data == null ? null : _data.getMendixObject());
			Core.execute(context, "MyFirstModule.TransientRotatedColumnHeaderData_CreateCss", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static java.util.List<myfirstmodule.proxies.TransientSalesOrderPivotTable> transientSalesOrderPivotTable_CreateList(IContext context, myfirstmodule.proxies.TransientSalesOrderPivotTableParameters _transientSalesOrderPivotTableParameters)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("transientSalesOrderPivotTableParameters", _transientSalesOrderPivotTableParameters == null ? null : _transientSalesOrderPivotTableParameters.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "MyFirstModule.TransientSalesOrderPivotTable_CreateList", params);
			java.util.List<myfirstmodule.proxies.TransientSalesOrderPivotTable> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<myfirstmodule.proxies.TransientSalesOrderPivotTable>();
				for (IMendixObject obj : objs)
					result.add(myfirstmodule.proxies.TransientSalesOrderPivotTable.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static myfirstmodule.proxies.TransientSalesOrderPivotTableParameters transientSalesOrderPivotTableParameters_CreateObject(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.TransientSalesOrderPivotTableParameters_CreateObject", params);
			return result == null ? null : myfirstmodule.proxies.TransientSalesOrderPivotTableParameters.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}