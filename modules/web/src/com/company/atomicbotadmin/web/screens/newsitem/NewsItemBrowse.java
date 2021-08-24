package com.company.atomicbotadmin.web.screens.newsitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.atomicbotadmin.entity.NewsItem;

@UiController("atomicbotadmin_NewsItem.browse")
@UiDescriptor("news-item-browse.xml")
@LookupComponent("newsItemsTable")
@LoadDataBeforeShow
public class NewsItemBrowse extends StandardLookup<NewsItem> {
}