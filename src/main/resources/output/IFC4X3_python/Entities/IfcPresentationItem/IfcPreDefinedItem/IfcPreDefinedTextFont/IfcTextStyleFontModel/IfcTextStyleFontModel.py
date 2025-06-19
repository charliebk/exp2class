from typing import List

class IfcTextStyleFontModel(IfcPreDefinedTextFont):
    def __init__(self):
        self.FontFamily: List[IfcTextFontName] = None
        self.FontStyle: IfcFontStyle = None
        self.FontVariant: IfcFontVariant = None
        self.FontWeight: IfcFontWeight = None
        self.FontSize: IfcSizeSelect = None

    # === WHERE CLAUSES ===
    # MeasureOfFontSize : ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SELF.FontSize)) AND (SELF.FontSize > 0.)
