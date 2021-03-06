// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package myfirstmodule.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class TransientRotatedColumnHeaderData_SetInitialValuesAction extends CustomJavaAction<Boolean>
{
	private IMendixObject __data;
	private myfirstmodule.proxies.TransientRotatedColumnHeaderData data;

	public TransientRotatedColumnHeaderData_SetInitialValuesAction(IContext context, IMendixObject data)
	{
		super(context);
		this.__data = data;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.data = __data == null ? null : myfirstmodule.proxies.TransientRotatedColumnHeaderData.initialize(getContext(), __data);

		// BEGIN USER CODE
		
		data.setInputCssTableCell(
			"border: 1px solid #ccc;\n" +
			"color: black;\n" +
			"text-align: center;\n"
		);
		
		data.setInputCssHeaderTh(
			"position: relative;\n" +
			"vertical-align: bottom;\n" +
			"padding: 0;\n" +
			"font-size: 12px;\n"
		);
		
		data.setInputCssHeaderDiv(
			"position: relative;\n" +
			"top: 0px;\n" +
			"height: 100%;\n" +
			"overflow: hidden;\n" +
			"border-left: 1px solid #ccc;\n" +
			"border-right: 1px solid #ccc;\n" +
			"border-top: 1px solid #ccc;\n"
		);
		
		data.setInputCssHeaderSpan(
			"position: absolute;\n" +
			"display: inline-block;\n" +
			"text-align: left;\n" +
			"white-space: nowrap;\n"
		);
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "TransientRotatedColumnHeaderData_SetInitialValuesAction";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
