#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Flutter Games Endless Runner Template"
DESCRIPTION = "A Flame game template built with Flutter"
AUTHOR = "Flutter Team"
HOMEPAGE = "https://github.com/flutter/games"
BUGTRACKER = "https://github.com/flutter/flutter/issues"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "acd048d2b5654421e1dbf41355aa5647233c9e24"
SRC_URI = "git://github.com/flutter/games.git;lfs=0;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "endless_runner"
FLUTTER_APPLICATION_PATH = "templates/endless_runner"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"

inherit flutter-app
