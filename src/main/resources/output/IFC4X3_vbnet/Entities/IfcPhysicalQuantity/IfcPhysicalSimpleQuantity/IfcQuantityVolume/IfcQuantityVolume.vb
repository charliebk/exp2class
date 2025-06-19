Public Class IfcQuantityVolume Inherits IfcPhysicalSimpleQuantity
    Public VolumeValue As IfcVolumeMeasure
    Public Formula As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.VOLUMEUNIT)
    ' WR22 : VolumeValue >= 0.
End Class
