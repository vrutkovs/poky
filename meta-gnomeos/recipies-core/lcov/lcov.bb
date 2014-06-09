DESCRIPTION = "LTP GCOV extension"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

PV= "1.10"
PR= "r0"

SRC_URI = "http://downloads.sourceforge.net/ltp/lcov-${PV}.tar.gz"
SRC_URI[sha256sum] = "530fc9ad7c5dd4d7ed1cababa578288d112d803144d8176a25df45906f568e95"

S = "${WORKDIR}/${PN}-${PV}"

do_install () {
    oe_runmake install PREFIX=${D}
}
