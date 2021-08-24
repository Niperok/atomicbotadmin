package com.company.atomicbotadmin.web.screens.newsitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.atomicbotadmin.entity.NewsItem;

@UiController("atomicbotadmin_NewsItem.edit")
@UiDescriptor("news-item-edit.xml")
@EditedEntityContainer("newsItemDc")
@LoadDataBeforeShow
public class NewsItemEdit extends StandardEditor<NewsItem> {
}