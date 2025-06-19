# SELECT TYPE IfcLightDistributionDataSourceSelect
# Options:
# - IfcExternalReference
# - IfcLightIntensityDistribution
class IfcLightDistributionDataSourceSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcExternalReference, IfcLightIntensityDistribution)):
            raise TypeError("value must be one of: IfcExternalReference, IfcLightIntensityDistribution")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
