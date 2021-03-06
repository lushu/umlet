package com.baselet.element.settings;

import java.util.List;

import com.baselet.control.enums.ElementStyle;
import com.baselet.element.facet.Facet;
import com.baselet.element.facet.Settings;

public class SettingsAutoresize extends Settings {

	@Override
	public ElementStyle getElementStyle() {
		return ElementStyle.AUTORESIZE;
	}

	@Override
	protected List<Facet> createFacets() {
		return Settings.AUTORESIZE;
	}
}
