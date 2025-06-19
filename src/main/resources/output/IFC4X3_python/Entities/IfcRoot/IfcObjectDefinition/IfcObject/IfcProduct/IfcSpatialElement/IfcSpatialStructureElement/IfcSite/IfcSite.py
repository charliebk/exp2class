class IfcSite(IfcSpatialStructureElement):
    def __init__(self):
        self.RefLatitude: IfcCompoundPlaneAngleMeasure = None
        self.RefLongitude: IfcCompoundPlaneAngleMeasure = None
        self.RefElevation: IfcLengthMeasure = None
        self.LandTitleNumber: IfcLabel = None
        self.SiteAddress: IfcPostalAddress = None
