package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcTextStyleFontModel extends IfcPreDefinedTextFont {

    public IfcFontStyle FontStyle; // OPTIONAL
    public IfcFontVariant FontVariant; // OPTIONAL
    public IfcFontWeight FontWeight; // OPTIONAL
    public IfcSizeSelect FontSize;
    // INVERSE attributes:
    // MeasureOfFontSize : ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SELF.FontSize)) AND
    // (SELF.FontSize > 0.);

    // WHERE constraints:
    // MeasureOfFontSize : ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SELF.FontSize)) AND
    // (SELF.FontSize > 0.);
}
